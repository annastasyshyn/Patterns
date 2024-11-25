package ua.edu.ucu.mail;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public class MailInfo {
    @Getter
    private Client client;
    private MailCode mailCode;

    public String generate() {
        return mailCode.generate(client);
        
    }
}
