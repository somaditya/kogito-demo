package com.amdocs.kogito.services;

import io.quarkus.mailer.Mail;
import io.quarkus.mailer.Mailer;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class EmailService {

    @Inject
    Mailer mailer;

    public void sendEmail(String to, String subject, String body) {
        mailer.send(Mail.withText(to, subject, body));
    }

}