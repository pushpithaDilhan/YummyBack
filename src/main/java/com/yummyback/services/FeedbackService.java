package com.yummyback.services;

import com.yummyback.models.Feedback;
import com.yummyback.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.io.IOException;

public class FeedbackService {

    public void InsertFeedback(Feedback feedback) throws IOException {
        SqlSession session = MybatisUtil.getSqlSessionFactory().openSession();
        session.insert("Feedback.insert", feedback);
        session.commit();
        session.close();
    }

    public Feedback GetFeedbackByUUID(String UUID) throws IOException {
        SqlSession session = MybatisUtil.getSqlSessionFactory().openSession();
        Feedback feedback = session.selectOne("Feedback.getByUUID", UUID);
        session.commit();
        session.close();
        return feedback;
    }

}
