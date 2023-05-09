package Job_Portal_Application.MyProject.Repositpries;

import Job_Portal_Application.MyProject.Models.Notification;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotificationRepository extends JpaRepository<Notification, Long> {
}
