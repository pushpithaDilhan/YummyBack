import com.yummyback.models.Feedback;
import com.yummyback.services.FeedbackService;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;

public class FeedbackServiceTest {
    private static FeedbackService feedbackService;

    @BeforeClass
    public static void setup(){
        FeedbackService feedbackService = new FeedbackService();
    }

    @AfterClass
    public static void teardown(){
        feedbackService = null;
    }

    @Test
    public void testInsertFeedback() throws IOException {
        Feedback feedback = new Feedback();
        feedback.setFeedback_id("6d55cf9e-a91f-4dd1-96cf-13376f860def");
        feedback.setService(5);
        feedback.setQuality(4);
        feedback.setCleanliness(4);
        feedback.setFood_value(3);
        feedback.setRes_time(2);
        feedback.setComments("Delicious food");
        feedback.setEmail("test_123@gmail.com");
        feedback.setMobile("0123456789");
        feedback.setDatetime("05/11/17 18:49:47");

        feedbackService.InsertFeedback(feedback);
    }

}