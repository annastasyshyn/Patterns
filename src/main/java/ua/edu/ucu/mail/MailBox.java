package ua.edu.ucu.mail;

import java.util.List;

public class MailBox {
    private List<MailInfo> info;
    private MailSender mailSender;
    void addMailInfo(MailInfo mailInfo) {
        info.add(mailInfo);
    }
    void sendAll() {
        for (MailInfo mailInfo : info) {
            mailSender.sendMail(mailInfo);
        }
    }

}
