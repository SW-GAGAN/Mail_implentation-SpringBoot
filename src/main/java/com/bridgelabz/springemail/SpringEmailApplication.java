package com.bridgelabz.springemail;

import com.bridgelabz.springemail.services.EmailSendereService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

import javax.mail.MessagingException;

@SpringBootApplication
public class SpringEmailApplication {

    @Autowired
    private EmailSendereService emailSendereService;

    public static void main(String[] args) {

        SpringApplication.run(SpringEmailApplication.class, args);
    }
    @EventListener(ApplicationReadyEvent.class)
    public void triggerEmail() throws MessagingException {
        emailSendereService.sendMailWithAttachment("srgagan73@gmail.com", "This is body", "This is email sertvice with attachment","/Users/Gagan SR/Downloads/upsc.pdf");

    }

}
