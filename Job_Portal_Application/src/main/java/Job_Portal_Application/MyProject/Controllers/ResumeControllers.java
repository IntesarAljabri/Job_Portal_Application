package Job_Portal_Application.MyProject.Controllers;
import Job_Portal_Application.MyProject.Models.Resume;
import Job_Portal_Application.MyProject.Services.ResumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "resumes")
public class ResumeControllers {


    @Autowired
    ResumeService resumeServices;
    @GetMapping(value = "getAll")
    public List<Resume> getAllResumes(){
        return  resumeServices.getAllResumes();
    }
}
