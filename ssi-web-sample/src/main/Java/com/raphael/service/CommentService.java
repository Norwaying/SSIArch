package com.raphael.service;

import com.raphael.bean.Comment;
import com.raphael.dao.CommentDAO;

/**
 * 逻辑
 * Created by Administrator on 2015/2/14.
 * add逻辑
 * sub逻辑
 */
public class CommentService {
    private CommentDAO commentDAO;

    public void addComment(Comment comment){
        commentDAO.insertComment(comment);
    }

    public void subComment(Comment comment){
        ;
    }

    public void setCommentDAO(CommentDAO commentDAO) {
        this.commentDAO = commentDAO;
    }
}