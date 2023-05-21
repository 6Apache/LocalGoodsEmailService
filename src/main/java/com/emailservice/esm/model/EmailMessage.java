package com.emailservice.esm.model;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class EmailMessage {
    private String receiver;
    private String topic;
    private String mail;
}
