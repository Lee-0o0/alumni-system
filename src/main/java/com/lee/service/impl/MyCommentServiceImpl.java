package com.lee.service.impl;

import com.lee.domain.*;
import com.lee.mapper.AlumniMapper;
import com.lee.mapper.MyCommentMapper;
import com.lee.mapper.UserMapper;
import com.lee.service.MyCommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class MyCommentServiceImpl implements MyCommentService {

    @Autowired
    private MyCommentMapper myCommentMapper;
    @Autowired
    private AlumniMapper alumniMapper;

    /**
     * 查询某条帖子下的未被删除的一级评论
     * @param postId
     * @return
     */
    @Override
    public List<MyComment> findAllCommentsOfSomePost(int postId) {
        MyCommentExample myCommentExample = new MyCommentExample();
        myCommentExample.createCriteria()
                .andMycommentPostEqualTo(postId)
                .andMycommentDeleteEqualTo("0")
                .andMycommentParentEqualTo(-1);
        List<MyComment> comments = myCommentMapper.selectByExample(myCommentExample);
        return comments;
    }

    @Override
    public MyCommentTree findAllCommentsOfSomeComment(int commentdId) {
        MyCommentTree myCommentTree = new MyCommentTree();
        MyComment comment = myCommentMapper.selectByPrimaryKey(commentdId);
        Alumni alumni = alumniMapper.selectByPrimaryKey(comment.getMycommentPublisher());
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
        comment.setMycommentPublisher(identification);
        myCommentTree.setNode(comment);
        myCommentTree.setChilds(new ArrayList<MyCommentTree>());

        MyCommentExample myCommentExample = new MyCommentExample();
        myCommentExample.createCriteria().andMycommentParentEqualTo(comment.getMycommentId());
        List<MyComment> myComments = myCommentMapper.selectByExample(myCommentExample);
        if(myComments == null){
            return null;
        }

        for (MyComment myComment:myComments){
            MyCommentTree commentTree = findAllCommentsOfSomeComment(myComment.getMycommentId());
            myCommentTree.getChilds().add(commentTree);
        }

        return myCommentTree;
    }

    @Override
    public boolean delete(int commentId) {
        MyComment myComment = new MyComment();
        myComment.setMycommentId(commentId);
        myComment.setMycommentDelete("1");
        int i = myCommentMapper.updateByPrimaryKeySelective(myComment);
        return i == 1;
    }

    @Override
    public MyComment findById(int commentId) {
        return myCommentMapper.selectByPrimaryKey(commentId);
    }

    @Override
    public boolean insertComment(MyComment myComment) {
        //设置评论时间
        myComment.setMyCommentPublishTime(LocalDateTime.now());
        //设置评论是否被删除
        myComment.setMycommentDelete("0");
        //设置评论的上一级评论
        myComment.setMycommentParent(-1);
        return myCommentMapper.insert(myComment) == 1;
    }

    @Override
    public boolean deleteOfPost(int postId) {
        MyCommentExample myCommentExample = new MyCommentExample();
        myCommentExample.createCriteria().andMycommentPostEqualTo(postId).andMycommentDeleteEqualTo("0");
        List<MyComment> myComments = myCommentMapper.selectByExample(myCommentExample);
        for (MyComment myComment:myComments){
            myComment.setMycommentDelete("1");
            myCommentMapper.updateByPrimaryKey(myComment);
        }
        return true;
    }
}
