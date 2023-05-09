package Job_Portal_Application.MyProject.Repositpries;

import Job_Portal_Application.MyProject.Models.Interview;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InterviewRepository extends JpaRepository<Interview, Long> {
}
