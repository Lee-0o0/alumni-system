package com.lee.service;

import com.lee.domain.MyComment;
import com.lee.domain.MyCommentTree;

import java.util.List;

public interface MyCommentService {
    //查询某条帖子下的所有评论
    public List<MyComment> findAllCommentsOfSomePost(int postId);
    //查询以某一个评论为根节点的评论树
    public MyCommentTree findAllCommentsOfSomeComment(int commentdId);
    //删除某个评论
    public boolean delete(int commentId);
    //根据id查找某个评论
    public MyComment findById(int commentId);
    //增加评论
    public boolean insertComment(MyComment myComment);
    //删除某个帖子下的评论
    public boolean deleteOfPost(int postId);
}
