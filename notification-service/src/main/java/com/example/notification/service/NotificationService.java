package com.example.notification.service;

import com.example.notification.model.Notification;
import com.example.notification.repository.NotificationRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class NotificationService {

    private final NotificationRepository repository;

    public NotificationService(NotificationRepository repository) {
        this.repository = repository;
    }

    public Notification sendNotification(Notification notification) {
        return repository.save(notification);
    }

    public List<Notification> getUserNotifications(String userId) {
        return repository.findByUserId(userId);
    }
}
