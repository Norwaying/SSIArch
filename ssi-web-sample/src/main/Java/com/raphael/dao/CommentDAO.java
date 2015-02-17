package com.raphael.dao;

import com.raphael.bean.Comment;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

/**
 * 持久
 * Created by Administrator on 2015/2/14.
 * insert
 * remove
 */
public class CommentDAO {
    private SqlSessionTemplate sqlSession;

    public void setSqlSession(SqlSessionTemplate sqlSession) {
        this.sqlSession = sqlSession;
    }

    public void insertComment(Comment comment){
        sqlSession.insert("insertComment",comment);
    }

    public void removeComment(Comment comment) {

    }

    public List<Comment> queryAllComment(){
        return sqlSession.selectList("queryAllComment");
    }
}
