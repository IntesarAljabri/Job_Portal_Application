package Job_Portal_Application.MyProject.Controllers;
import Job_Portal_Application.MyProject.Models.JobSeeker;
import Job_Portal_Application.MyProject.Services.JobSeekerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "job seekers")
public class JobSeekerControllers {

    @Autowired
    JobSeekerService jobSeekerServices;
    @GetMapping(value = "getAll")
    public List<JobSeeker> getAllJobSeekers(){
        return  jobSeekerServices.getAllJobSeekers();
    }
}
