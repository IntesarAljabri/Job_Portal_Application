package Job_Portal_Application.MyProject.Controllers;
import Job_Portal_Application.MyProject.Models.Employer;
import Job_Portal_Application.MyProject.Services.EmployerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "employers")
public class EmployerControllers {

    @Autowired
    EmployerService employerServices;

    @GetMapping(value = "getAll")
    public List<Employer> getAllEmployers(){
        return  employerServices.getAllEmployers();
    }
}
