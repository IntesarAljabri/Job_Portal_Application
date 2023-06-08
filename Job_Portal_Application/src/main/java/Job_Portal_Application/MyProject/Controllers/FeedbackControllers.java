package Job_Portal_Application.MyProject.Controllers;

import Job_Portal_Application.MyProject.Models.Feedback;
import Job_Portal_Application.MyProject.Services.FeedBackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "feedbacks")
public class FeedbackControllers {

    @Autowired
    FeedBackService feedbackServices;

    @GetMapping(value = "getAll")
    public List<Feedback> getAllFeedbacks(){
        return  feedbackServices.getAllFeedbacks();
    }

}
