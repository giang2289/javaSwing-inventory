/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlkh.testView;

import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author user
 */
public class sendMailTest {
    public static void sendMail(String recepient,String content) throws Exception{
        System.out.println("starting");
        Properties properties = new Properties();
        
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.host","smtp.gmail.com");
        properties.put("mail.smtp.port", "587");
        
        String myAccountEmail = "tienhuy031001@gmail.com";
        String password = "tienhuy0310";
        
        Session session = Session.getInstance(properties,new Authenticator() {

            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(myAccountEmail, password); //To change body of generated methods, choose Tools | Templates.
            }
            
        });
        Message message = prepareMessage(session,myAccountEmail,recepient,content);
        Transport.send(message);
        System.out.println("finished");
    }

    private static Message prepareMessage(Session session, String myAccountEmail,String recepient,String content) {
        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(myAccountEmail));
            message.setRecipient(Message.RecipientType.TO, new InternetAddress(recepient));
            message.setSubject("My firt email from app java");
            message.setText(content);
            return message;
        } catch (Exception ex) {
            Logger.getLogger(sendMailTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}