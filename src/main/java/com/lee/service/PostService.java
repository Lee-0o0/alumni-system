package com.lee.service;

import com.lee.domain.Post;
import javafx.geometry.Pos;

import java.util.List;

public interface PostService {
    // 查询所有帖子，包括被删除的帖子
    public List<Post> findAll();
    //查询所有被删除的帖子
    public List<Post> findAllDeleted();
    //查询所有未被删除的帖子
    public List<Post> findAllNotDeleted();
    //根据id查询
    public Post findById(int id);
    //发表新帖子
    public boolean insert(Post post);
    //删除帖子
    public boolean delete(int id);
    //修改帖子
    public boolean update(Post post);
    //查询某一个用户下的所有帖子
    public List<Post> findPostsOfAUser(String username);
}
