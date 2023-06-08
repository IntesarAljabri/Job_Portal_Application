package Job_Portal_Application.MyProject.Repositpries;

import Job_Portal_Application.MyProject.Models.Application;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApplicationRepository extends JpaRepository<Application, Long> {
}
