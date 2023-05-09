package Job_Portal_Application.MyProject.Repositpries;

import Job_Portal_Application.MyProject.Models.Application;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApplicationRepository extends JpaRepository<Application, Long> {
}
