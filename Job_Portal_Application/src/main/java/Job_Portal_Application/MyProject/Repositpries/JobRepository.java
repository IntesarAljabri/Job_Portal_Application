package Job_Portal_Application.MyProject.Repositpries;

import Job_Portal_Application.MyProject.Models.Job;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobRepository extends JpaRepository<Job, Long> {
}
