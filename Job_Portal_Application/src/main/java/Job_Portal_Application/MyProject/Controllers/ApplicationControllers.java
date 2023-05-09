package Job_Portal_Application.MyProject.Controllers;
import Job_Portal_Application.MyProject.Models.Application;
import Job_Portal_Application.MyProject.Services.ApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class ApplicationControllers {
        @Autowired
        ApplicationService applicationService;

        @GetMapping(value = "getAll")
        public List<Application> getAllApplications(){
            return  applicationService.getAllApplications();
        }
}
