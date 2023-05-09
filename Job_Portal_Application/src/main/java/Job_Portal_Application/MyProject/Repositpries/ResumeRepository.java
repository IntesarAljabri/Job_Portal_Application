package Job_Portal_Application.MyProject.Repositpries;

import Job_Portal_Application.MyProject.Models.Resume;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ResumeRepository extends JpaRepository<Resume, Long> {
}
