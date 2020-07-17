package com.lee.controller;

import com.lee.domain.Alumni;
import com.lee.domain.MyComment;
import com.lee.domain.MyCommentTree;
import com.lee.domain.Post;
import com.lee.service.AlumniService;
import com.lee.service.MyCommentService;
import com.lee.service.PostService;
import javafx.geometry.Pos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.time.format.DateTimeFormatter;
import java.util.*;

/**
 * 帖子控制器
 */
@Controller
public class PostController {

    @Autowired private PostService postService;
    @Autowired private MyCommentService myCommentService;
    @Autowired private AlumniService alumniService;

    /**
     * 管理员查询所有的帖子
     * @param request
     * @return
     */
    @RequestMapping("/admin/posts")
    public String findAll(HttpServletRequest request) {
        List<Post> posts = postService.findAllNotDeleted();
        for (Post post : posts) {
            String postPublisher = post.getPostPublisher();
            Alumni publisherInfo = alumniService.findByNumber(postPublisher);
            String name = "";
            if (publisherInfo == null) {
                name = "已注销";
            } else {
                name =
                        publisherInfo.getAlumniName()
                                + "("
                                + publisherInfo.getAlumniMajor()
                                + " "
                                + publisherInfo.getAlumniGrade()
                                + "级)";
            }
            post.setPostPublisher(name);
        }
        request.setAttribute("posts", posts);
        // 格式化时间
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        request.setAttribute("formatter", formatter);
        return "posts";
    }

    /**
     * 校友查询所有的帖子，包括帖子的评论
     * @param request
     * @return
     */
    @GetMapping("/posts")
    public String getPostsByUser(HttpServletRequest request) {
        // 查询所有帖子
        List<Post> posts = postService.findAllNotDeleted();
        for (Post post : posts) {
            String postPublisher = post.getPostPublisher();
            Alumni publisherInfo = alumniService.findByNumber(postPublisher);
            String name = "";
            if (publisherInfo == null) {
                name = "已注销";
            } else {
                name =
                        publisherInfo.getAlumniName()
                                + "("
                                + publisherInfo.getAlumniMajor()
                                + " "
                                + publisherInfo.getAlumniGrade()
                                + "级)";
            }
            post.setPostPublisher(name);
        }
        request.setAttribute("posts", posts);
        // 查询所有帖子的评论
        Map<Integer, List<MyComment>> allComments = new HashMap<>();
        for (Post post : posts) {
            Integer postId = post.getPostId();
            List<MyComment> allCommentsOfSomePost =
                    myCommentService.findAllCommentsOfSomePost(postId);
            for (MyComment myComment:allCommentsOfSomePost){
                String mycommentPublisher = myComment.getMycommentPublisher();
                Alumni alumni = alumniService.findByNumber(mycommentPublisher);
                String identification = "";
                if (alumni != null) {
                    identification =
                            alumni.getAlumniName()
                                    + "("
                                    + alumni.getAlumniGrade()
                                    + "-"
                                    + alumni.getAlumniMajor()
                                    + ")";
                }else {
                    identification = "已注销校友";
                }
                myComment.setMycommentPublisher(identification);
            }
            allComments.put(postId,allCommentsOfSomePost);
        }
        Set<Map.Entry<Integer, List<MyComment>>> entries = allComments.entrySet();
        for (Map.Entry<Integer,List<MyComment>> entry:entries){
            entry.getValue();
        }
        request.setAttribute("comments",entries);
        // 格式化时间
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        request.setAttribute("formatter", formatter);
        return "user-posts";
    }

    /**
     * 管理员获取某一个帖子及其评论
     * @param id
     * @param request
     * @return
     */
    @GetMapping("/admin/post/{id}")
    public String findById(@PathVariable int id, HttpServletRequest request) {
        Post post = postService.findById(id);
        //        post.setPostContent(post.getPostContent().replace("\n","<br/>"));
        System.out.println(post.getPostContent());
        Alumni publisherInfo = alumniService.findByNumber(post.getPostPublisher());
        String name = "";
        if (publisherInfo == null) {
            name = "已注销";
        } else {
            name =
                    publisherInfo.getAlumniName()
                            + "("
                            + publisherInfo.getAlumniMajor()
                            + " "
                            + publisherInfo.getAlumniGrade()
                            + "级)";
        }
        post.setPostPublisher(name);

        // 查询某条帖子下的首评论
        List<MyComment> commentsList = myCommentService.findAllCommentsOfSomePost(id);
        List<MyCommentTree> commentTreeList = new ArrayList<>();

        for (MyComment myComment : commentsList) {
            MyCommentTree allCommentsOfSomeComment =
                    myCommentService.findAllCommentsOfSomeComment(myComment.getMycommentId());
            commentTreeList.add(allCommentsOfSomeComment);
        }

        request.setAttribute("post", post);
        request.setAttribute("comments", commentTreeList);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        request.setAttribute("formatter", formatter);

        return "post";
    }

    /**
     * 管理员删除帖子
     * @param id
     * @return
     */
    @RequestMapping("/admin/deletepost/{id}")
    public String delete(@PathVariable int id) {
        postService.delete(id);
        myCommentService.deleteOfPost(id);
        return "redirect:/admin/posts";
    }

    /**
     * 校友删除自己的帖子
     * @param id
     * @param request
     * @return
     */
    @RequestMapping("/userdeletepost/{id}")
    public String deleteByUser(@PathVariable int id,HttpServletRequest request) {
        postService.delete(id);
        myCommentService.deleteOfPost(id);
        return "redirect:/myposts?username="+request.getSession().getAttribute("username");
    }

    /**
     * 校友发表帖子
     * @param post
     * @return
     */
    @PostMapping("/post")
    public String insert(Post post){
        boolean isok = postService.insert(post);
        return "redirect:/posts";
    }

    /**
     * 校友查询自己发表的帖子
     * @param username
     * @param request
     * @return
     */
    @GetMapping("/myposts")
    public String getAllPostsByUser(@RequestParam String username,
                                    HttpServletRequest request){
        List<Post> postsOfAUser = postService.findPostsOfAUser(username);
        request.setAttribute("posts",postsOfAUser);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        request.setAttribute("formatter", formatter);
        return "my-posts";
    }

    /**
     * 校友更新自己的帖子
     * @param post
     * @param request
     * @return
     */
    @PostMapping("/updatepost")
    public String updatePost(Post post,HttpServletRequest request){
        System.out.println(post);
        boolean b = postService.update(post);
        return "redirect:/myposts?username="+request.getSession().getAttribute("username");
    }
}
