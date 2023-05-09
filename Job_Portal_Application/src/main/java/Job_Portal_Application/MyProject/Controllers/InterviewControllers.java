package Job_Portal_Application.MyProject.Controllers;

import Job_Portal_Application.MyProject.Models.Interview;
import Job_Portal_Application.MyProject.Services.InterviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "interviews")
public class InterviewControllers {

    @Autowired
    InterviewService interviewServices;
    @GetMapping(value = "getAll")
    public List<Interview> getAllInterviews(){
        return  interviewServices.getAllInterviews();
    }
}
