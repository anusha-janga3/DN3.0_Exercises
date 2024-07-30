package com.example.test;

import com.example.notifier.EmailNotifier;
import com.example.notifier.Notifier;
import com.example.notifier.SMSNotifierDecorator;
import com.example.notifier.SlackNotifierDecorator;
public class DecoratorPatternTest {
    public static void main(String[] args) {
        Notifier emailNotifier = new EmailNotifier();
        Notifier smsNotifier = new SMSNotifierDecorator(emailNotifier);
        Notifier slackNotifier = new SlackNotifierDecorator(smsNotifier);

        System.out.println("Sending notification using EmailNotifier:");
        emailNotifier.send("Hello, this is an email!");

        System.out.println("\nSending notification using SMSNotifierDecorator:");
        smsNotifier.send("Hello, this is an email with SMS!");

        System.out.println("\nSending notification using SlackNotifierDecorator:");
        slackNotifier.send("Hello, this is an email with SMS and Slack!");
    }
}
