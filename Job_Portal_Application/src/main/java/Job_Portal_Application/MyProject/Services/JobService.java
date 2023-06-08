package Job_Portal_Application.MyProject.Services;
import Job_Portal_Application.MyProject.Models.Job;
import Job_Portal_Application.MyProject.Repositpries.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {
    @Autowired
    JobRepository jobRepository;


    public List<Job> getAllJobs(){
        return  jobRepository.findAll();
    }

}
