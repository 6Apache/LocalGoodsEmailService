package com.emailservice.esm.controller;

import com.emailservice.esm.model.EmailMessage;
import com.emailservice.esm.service.EmailService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/email", produces = "application/json")
@RequiredArgsConstructor
public class EmailController {

    private final EmailService emailService;

    @PostMapping()
    @ResponseStatus(HttpStatus.OK)
    public void sendEmail(@RequestBody EmailMessage emailMessage) {
        emailService.sendEmail(emailMessage);
    }
}
