package Job_Portal_Application.MyProject.Services;
import Job_Portal_Application.MyProject.Models.JobSeeker;
import Job_Portal_Application.MyProject.Repositpries.JobSeekerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobSeekerService {

    @Autowired
    JobSeekerRepository jobSeekerRepository;


    public List<JobSeeker> getAllJobSeekers(){
        return  jobSeekerRepository.findAll();
    }
}
