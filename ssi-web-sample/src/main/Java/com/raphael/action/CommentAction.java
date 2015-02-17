package com.raphael.action;

import com.raphael.bean.Comment;
import com.opensymphony.xwork2.ActionSupport;
import com.raphael.service.CommentService;
import org.apache.velocity.VelocityContext;

import java.util.List;

/**
 * 应用
 * Created by Administrator on 2015/2/14.
 */
public class CommentAction extends ActionSupport {
    private CommentService commentService;
    private Comment comment;
    private String title;
    private String content;

    @Override
    public String execute(){

        comment = new Comment(getTitle(),getContent());
        commentService.addComment(comment);
//        comment = new Comment(comment.getTitle(),comment.getContent());
//        Comment c = getComment();
//        commentService.addComment(c);
//        commentService.subComment(comment);
        List<Comment> commentList = commentService.selectAllComment();
        VelocityContext context = new VelocityContext();
        context.put("commentList",commentList);
        String aaa = "fedasd";
//        commentList.add(comment);
//        if("a".equals(comment.getTitle().toString()))
            return "success";
//        else
//            return "failure";
        //return "failure";
    }

    public void setCommentService(CommentService commentService) {
        this.commentService = commentService;
    }

    public Comment getComment() {
        return comment;
    }

    public void setComment(Comment comment) {
        this.comment = comment;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
