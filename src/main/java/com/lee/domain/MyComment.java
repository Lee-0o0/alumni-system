package com.lee.domain;

import java.time.LocalDateTime;

public class MyComment {
    private Integer mycommentId;

    private String mycommentContent;

    private LocalDateTime myCommentPublishTime;

    private Integer mycommentPost;

    private Integer mycommentParent;

    private String mycommentPublisher;

    private String mycommentDelete;

    public Integer getMycommentId() {
        return mycommentId;
    }

    public void setMycommentId(Integer mycommentId) {
        this.mycommentId = mycommentId;
    }

    public String getMycommentContent() {
        return mycommentContent;
    }

    public void setMycommentContent(String mycommentContent) {
        this.mycommentContent = mycommentContent == null ? null : mycommentContent.trim();
    }

    public LocalDateTime getMyCommentPublishTime() {
        return myCommentPublishTime;
    }

    public void setMyCommentPublishTime(LocalDateTime myCommentPublishTime) {
        this.myCommentPublishTime = myCommentPublishTime;
    }

    public Integer getMycommentPost() {
        return mycommentPost;
    }

    public void setMycommentPost(Integer mycommentPost) {
        this.mycommentPost = mycommentPost;
    }

    public Integer getMycommentParent() {
        return mycommentParent;
    }

    public void setMycommentParent(Integer mycommentParent) {
        this.mycommentParent = mycommentParent;
    }

    public String getMycommentPublisher() {
        return mycommentPublisher;
    }

    public void setMycommentPublisher(String mycommentPublisher) {
        this.mycommentPublisher = mycommentPublisher == null ? null : mycommentPublisher.trim();
    }

    public String getMycommentDelete() {
        return mycommentDelete;
    }

    public void setMycommentDelete(String mycommentDelete) {
        this.mycommentDelete = mycommentDelete == null ? null : mycommentDelete.trim();
    }

    @Override
    public String toString() {
        return "MyComment{" +
                "mycommentId=" + mycommentId +
                '}';
    }
}