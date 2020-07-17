package com.lee.domain;

import java.util.List;

public class MyCommentTree {
    MyComment node;
    List<MyCommentTree> childs;

    public MyComment getNode() {
        return node;
    }

    public void setNode(MyComment node) {
        this.node = node;
    }

    public List<MyCommentTree> getChilds() {
        return childs;
    }

    public void setChilds(List<MyCommentTree> childs) {
        this.childs = childs;
    }

    @Override
    public String toString() {
        return "MyCommentTree{" +
                "node=" + node +
                ", childs=" + childs +
                '}';
    }
}
