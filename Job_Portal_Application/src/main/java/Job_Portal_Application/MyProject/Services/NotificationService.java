package Job_Portal_Application.MyProject.Services;
import Job_Portal_Application.MyProject.Models.Notification;
import Job_Portal_Application.MyProject.Repositpries.NotificationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NotificationService {

    @Autowired
    NotificationRepository notificationRepository;


    public List<Notification> getAllNotifications(){
        return  notificationRepository.findAll();
    }
}
