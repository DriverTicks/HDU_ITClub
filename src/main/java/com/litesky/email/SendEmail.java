package com.litesky.email;

import com.litesky.model.EmailConfig;
import com.litesky.model.Message;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;
import java.util.Properties;

/**
 * Created by finefine.com on 2017/10/1.
 */
public class SendEmail {
    private EmailConfig emailConfig;
    private Message message;
    private String to;


    public static void main(String args[])
    {
        EmailConfig emailConfig=new EmailConfig();
        emailConfig.setHost("smtp.163.com");
        emailConfig.setProcotol("smtp");
        emailConfig.setUserName("tianrandailoving@163.com");
        emailConfig.setPassword("2017hdu");

        Message message=new Message();
        message.setSubject("tset");
        message.setContent("哈哈哈哈或或或");
        SendEmail sendEmail=new SendEmail(emailConfig,message,"530362991@qq.com");
        sendEmail.sendEmail();
    }

    /**
     * 发送邮件构造函数
     * @param emailConfig 邮件系统配置
     * @param message 消息
     * @param to 要发送的邮箱地址
     */
    public SendEmail(EmailConfig emailConfig, Message message, String to) {
        this.emailConfig = emailConfig;
        this.message = message;
        this.to = to;
    }

    public int sendEmail()
    {
        String from=emailConfig.getUserName();
        String pwd=emailConfig.getPassword();
        String host=emailConfig.getHost();
        String procotol=emailConfig.getProcotol();

        Properties properties=new Properties();
        properties.setProperty("mail.smtp.host",host);
        properties.setProperty("mail.smtp.auth","true");
        properties.setProperty("mail.transport","smtp");

        Session session=Session.getDefaultInstance(properties, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {

                return new PasswordAuthentication(from,pwd);
            }
        });

        MimeMessage mimeMessage=new MimeMessage(session);
        try {
            mimeMessage.setFrom(new InternetAddress(from));
        } catch (MessagingException e) {
            e.printStackTrace();
            return 1;
        }

        try {
            mimeMessage.addRecipient(javax.mail.Message.RecipientType.TO,new InternetAddress(to));
        } catch (MessagingException e) {
            e.printStackTrace();
            return 2;
        }
        try {
            mimeMessage.setSubject(message.getSubject());
        } catch (MessagingException e) {
            e.printStackTrace();
            return 3;
        }
        try {
            mimeMessage.setText(message.getContent());
        } catch (MessagingException e) {
            e.printStackTrace();
            return 4;
        }
        try {
            Transport.send(mimeMessage);
        } catch (MessagingException e) {
            e.printStackTrace();
            return -1;
        }
        return 0;
    }
}
