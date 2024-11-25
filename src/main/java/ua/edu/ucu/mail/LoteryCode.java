package ua.edu.ucu.mail;

public class LoteryCode implements MailCode {
    @Override
    public String generate(Client client) {
        return "You have won a lottery, " + client.getName() + "!";
    }
}
