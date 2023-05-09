package Job_Portal_Application.MyProject.Repositpries;

import Job_Portal_Application.MyProject.Models.Feedback;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FeedBackRepository extends JpaRepository<Feedback, Long> {
}
