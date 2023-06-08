package Job_Portal_Application.MyProject.Services;
import Job_Portal_Application.MyProject.Models.Resume;
import Job_Portal_Application.MyProject.Repositpries.ResumeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResumeService {

    @Autowired
    ResumeRepository resumeRepository;


    public List<Resume> getAllResumes(){
        return  resumeRepository.findAll();
    }
}
