package ua.edu.ucu.mail;

public class BirthdayCode implements MailCode {
    @Override
    public String generate(Client client) {
        return "Happy Birthday, " + client.getName() + "!";
    }    
}
