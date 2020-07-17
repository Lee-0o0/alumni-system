package com.lee.domain;

import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;

public class Post {
    private Integer postId;

    private String postTitle;

    private String postKeyWord;

    private String postContent;

    private LocalDateTime postPublishTime;

    private String postPublisher;

    private String postDelete;

    public Integer getPostId() {
        return postId;
    }

    public void setPostId(Integer postId) {
        this.postId = postId;
    }

    public String getPostTitle() {
        return postTitle;
    }

    public void setPostTitle(String postTitle) {
        this.postTitle = postTitle == null ? null : postTitle.trim();
    }

    public String getPostKeyWord() {
        return postKeyWord;
    }

    public void setPostKeyWord(String postKeyWord) {
        this.postKeyWord = postKeyWord == null ? null : postKeyWord.trim();
    }

    public String getPostContent() {
        return postContent;
    }

    public void setPostContent(String postContent) {
        this.postContent = postContent == null ? null : postContent.trim();
    }

    public LocalDateTime getPostPublishTime() {
        return postPublishTime;
    }

    public void setPostPublishTime(LocalDateTime postPublishTime) {
        this.postPublishTime = postPublishTime;
    }

    public String getPostPublisher() {
        return postPublisher;
    }

    public void setPostPublisher(String postPublisher) {
        this.postPublisher = postPublisher == null ? null : postPublisher.trim();
    }

    public String getPostDelete() {
        return postDelete;
    }

    public void setPostDelete(String postDelete) {
        this.postDelete = postDelete == null ? null : postDelete.trim();
    }

    @Override
    public String toString() {
        return "Post{" +
                "postId=" + postId +
                ", postTitle='" + postTitle + '\'' +
                ", postKeyWord='" + postKeyWord + '\'' +
                ", postContent='" + postContent + '\'' +
                ", postPublishTime=" + postPublishTime +
                ", postPublisher='" + postPublisher + '\'' +
                ", postDelete='" + postDelete + '\'' +
                '}';
    }
}