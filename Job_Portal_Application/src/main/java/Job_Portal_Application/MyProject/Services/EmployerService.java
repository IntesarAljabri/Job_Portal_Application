package Job_Portal_Application.MyProject.Services;
import Job_Portal_Application.MyProject.Models.Employer;
import Job_Portal_Application.MyProject.Repositpries.EmployerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployerService {


    @Autowired
    EmployerRepository employerRepository;


    public List<Employer> getAllEmployers(){
        return  employerRepository.findAll();
    }
}
