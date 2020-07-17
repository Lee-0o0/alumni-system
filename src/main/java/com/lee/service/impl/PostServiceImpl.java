package com.lee.service.impl;

import com.lee.domain.Post;
import com.lee.domain.PostExample;
import com.lee.mapper.MyCommentMapper;
import com.lee.mapper.PostMapper;
import com.lee.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class PostServiceImpl implements PostService {

    @Autowired private PostMapper postMapper;
    @Autowired private MyCommentMapper myCommentMapper;

    @Override
    public List<Post> findAll() {
        return postMapper.selectByExample(null);
    }

    @Override
    public List<Post> findAllDeleted() {
        PostExample postExample = new PostExample();
        postExample.createCriteria().andPostDeleteEqualTo("1");
        List<Post> posts = postMapper.selectByExample(postExample);
        return posts;
    }

    @Override
    public List<Post> findAllNotDeleted() {
        PostExample postExample = new PostExample();
        postExample.createCriteria().andPostDeleteEqualTo("0");
        List<Post> posts = postMapper.selectByExample(postExample);
        return posts;
    }

    /**
     * 根据id显示post的详细情况
     *
     * @param id
     * @return
     */
    @Override
    public Post findById(int id) {
        return postMapper.selectByPrimaryKey(id);
    }

    @Override
    public boolean insert(Post post) {
        post.setPostDelete("0"); // 设置状态为未删除
        post.setPostPublishTime(LocalDateTime.now()); // 设置发表时间
        return postMapper.insert(post) == 1;
    }

    @Override
    public boolean delete(int id) {
        Post post = new Post();
        post.setPostId(id);
        post.setPostDelete("1");
        return postMapper.updateByPrimaryKeySelective(post) == 1;
    }

    @Override
    public boolean update(Post post) {
        return postMapper.updateByPrimaryKeySelective(post) == 1;
    }

    @Override
    public List<Post> findPostsOfAUser(String username) {
        PostExample postExample = new PostExample();
        postExample.createCriteria().andPostPublisherEqualTo(username).andPostDeleteEqualTo("0");
        List<Post> posts = postMapper.selectByExample(postExample);
        return posts;
    }
}
