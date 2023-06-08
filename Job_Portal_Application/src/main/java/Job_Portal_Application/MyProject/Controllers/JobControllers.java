package Job_Portal_Application.MyProject.Controllers;
import Job_Portal_Application.MyProject.Models.Job;
import Job_Portal_Application.MyProject.Services.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "jobs")
public class JobControllers {

    @Autowired
    JobService jobServices;
    @GetMapping(value = "getAll")
    public List<Job> getAllJobs(){
        return  jobServices.getAllJobs();
    }
}
