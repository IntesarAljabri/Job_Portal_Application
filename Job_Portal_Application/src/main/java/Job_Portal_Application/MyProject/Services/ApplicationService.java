package Job_Portal_Application.MyProject.Services;
import Job_Portal_Application.MyProject.Models.Application;
import Job_Portal_Application.MyProject.Repositpries.ApplicationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApplicationService {


    @Autowired
    ApplicationRepository applicationRepository;


    public List<Application> getAllApplications(){
        return  applicationRepository.findAll();
    }
}
