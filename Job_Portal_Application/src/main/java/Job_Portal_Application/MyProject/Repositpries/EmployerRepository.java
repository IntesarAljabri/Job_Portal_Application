package Job_Portal_Application.MyProject.Repositpries;

import Job_Portal_Application.MyProject.Models.Employer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployerRepository extends JpaRepository<Employer, Long> {
}
