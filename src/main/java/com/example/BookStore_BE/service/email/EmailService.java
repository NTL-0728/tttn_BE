package com.example.BookStore_BE.service.email;

public interface EmailService {
    public void sendMessage(String from, String to, String subject, String message);
}
