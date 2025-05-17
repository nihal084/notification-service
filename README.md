# Notification Service

A simple notification service built with Spring Boot.

## Objective

Build a system to send notifications (Email, SMS, and in-app) to users via REST APIs.

---

## Features

- **Send a Notification**:  
  `POST /api/notifications`  
  Create and store a notification for a user.

- **Get User Notifications**:  
  `GET /api/users/{userId}/notifications`  
  Retrieve all notifications for a specific user.

- **Notification Types**:  
  Supports "email", "sms", and "in-app" notifications.

---

## Tech Stack

- Java 17+
- Spring Boot
- Spring Data JPA
- H2 in-memory database

---

## 🚀 How to Run

1. **Requirements:**  
   - Java 17 or above  
   - Maven

2. **Clone or download this project.**

3. **Start the application:**  
   Open a terminal in the project folder and run:
