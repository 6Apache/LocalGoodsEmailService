package com.emailservice.esm.service;

import com.emailservice.esm.model.EmailMessage;
import lombok.RequiredArgsConstructor;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmailService {
    private final JavaMailSender mailSender;

    public void sendEmail(EmailMessage emailMessage) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("pak035791@gmail.com");
        message.setTo(emailMessage.getReceiver());
        message.setText(emailMessage.getMail());
        message.setSubject(message.getSubject());

        mailSender.send(message);
        System.out.println("Mail sent");
    }
}
