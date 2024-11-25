package ua.edu.ucu.mail;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MailInfoTest {

    private Client client;
    private MailCode mailCode;
    private MailInfo mailInfo;

    @Before
    public void setUp() {
        client = new Client();
        client.setName("BOB WOOD");
        mailCode = new BirthdayCode();
        mailInfo = new MailInfo(client, mailCode);
    }

    @Test
    public void testGenerateBday() {
        String result = mailInfo.generate();
        assertEquals("Happy Birthday, BOB WOOD!", result);
    }
    
    @Test
    public void testGeneratedLotery() {
        mailCode = new LoteryCode();
        mailInfo = new MailInfo(client, mailCode);
        String result = mailInfo.generate();
        assertEquals("You have won a lottery, BOB WOOD!", result);
    }
}
