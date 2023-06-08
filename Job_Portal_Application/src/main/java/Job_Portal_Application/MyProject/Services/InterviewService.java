package Job_Portal_Application.MyProject.Services;
import Job_Portal_Application.MyProject.Models.Interview;
import Job_Portal_Application.MyProject.Repositpries.InterviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InterviewService {

    @Autowired
    InterviewRepository interviewRepository;


    public List<Interview> getAllInterviews(){
        return  interviewRepository.findAll();
    }
}
