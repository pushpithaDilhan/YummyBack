package com.yummyback.services;

import com.yummyback.models.Feedback;
import com.yummyback.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.io.IOException;
import java.util.List;

public class FeedbackService {

    private static FeedbackService feedbackService;

    static {
        if(feedbackService == null){
                feedbackService = new FeedbackService();
        }
    }

    public static FeedbackService getFeedbackService(){
        return feedbackService;
    }

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

    public List<Feedback> GetAllFeedbacks(){
        SqlSession session = MybatisUtil.getSqlSessionFactory().openSession();
        List<Feedback> all_feedbacks = session.selectList("Feedback.getAllFeedbacks");
        session.commit();
        session.close();
        return all_feedbacks;
    }

}
