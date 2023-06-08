package Job_Portal_Application.MyProject.Repositpries;

import Job_Portal_Application.MyProject.Models.Feedback;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FeedBackRepository extends JpaRepository<Feedback, Long> {
}
