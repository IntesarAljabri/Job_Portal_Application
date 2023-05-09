package Job_Portal_Application.MyProject.Repositpries;

import Job_Portal_Application.MyProject.Models.JobSeeker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobSeekerRepository extends JpaRepository<JobSeeker, Long> {
}
