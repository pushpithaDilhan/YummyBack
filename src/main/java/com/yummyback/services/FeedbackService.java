package com.yummyback.services;

import com.yummyback.models.Feedback;
import com.yummyback.util.MybatisUtil;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;

public class FeedbackService {

    public void InsertFeedback(Feedback feedback) throws IOException {
        Reader reader = Resources.getResourceAsReader("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        SqlSession session24 = sqlSessionFactory.openSession();

        SqlSession session = MybatisUtil.getSqlSessionFactory().openSession();
        session.insert("Feedback.insert", feedback);
        session.commit();
        session.close();
    }

    public Feedback GetFeedbackByUUID(String UUID) throws IOException {
        SqlSession session = MybatisUtil.getSqlSessionFactory().openSession();
        Feedback feedback = (Feedback) session.selectOne("Feedback.getByUUID", UUID);
        session.commit();
        session.close();
        return feedback;
    }

}
