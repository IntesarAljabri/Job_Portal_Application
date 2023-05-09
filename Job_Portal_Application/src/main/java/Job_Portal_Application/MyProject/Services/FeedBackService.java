package Job_Portal_Application.MyProject.Services;
import Job_Portal_Application.MyProject.Models.Feedback;
import Job_Portal_Application.MyProject.Repositpries.FeedBackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FeedBackService {
    @Autowired
    FeedBackRepository feedbackRepository;


    public List<Feedback> getAllFeedbacks(){
        return  feedbackRepository.findAll();
    }
}
