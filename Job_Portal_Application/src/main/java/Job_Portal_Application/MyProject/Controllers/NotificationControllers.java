package Job_Portal_Application.MyProject.Controllers;
import Job_Portal_Application.MyProject.Models.Notification;
import Job_Portal_Application.MyProject.Services.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "notifications")
public class NotificationControllers {

    @Autowired
    NotificationService notificationServices;
    @GetMapping(value = "getAll")
    public List<Notification> getAllNotifications(){
        return  notificationServices.getAllNotifications();
    }
}
