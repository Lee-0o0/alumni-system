package com.lee.controller;

import com.lee.domain.MyComment;
import com.lee.service.MyCommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 评论控制器
 */
@Controller
public class MyCommentController {
    @Autowired
    private MyCommentService myCommentService;

    /**
     * 管理员删除评论
     * @param id
     * @return
     */
    @RequestMapping("/admin/deletecomment/{id}")
    public String delete(@PathVariable int id){
        MyComment comment = myCommentService.findById(id);
        Integer postId = comment.getMycommentPost();
        myCommentService.delete(id);
        return "redirect:/admin/post/"+postId;
    }

    /**
     * 校友增加评论
     * @param myComment
     * @return
     */
    @PostMapping("/mycomment")
    public String addComment(MyComment myComment){
        boolean b = myCommentService.insertComment(myComment);
        return "redirect:/posts";
    }
}
