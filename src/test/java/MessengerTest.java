import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class MessengerTest {

    @Test
    void shouldSendEmail() {

        MailServerMock mailServer = new MailServerMock();
        TemplateEngineStub templateEngine = new TemplateEngineStub();
        ClientStub client = new ClientStub();
        TemplateDummy template = new TemplateDummy();

        Messenger sut = new Messenger(mailServer, templateEngine);

        sut.sendMessage(client, template);

        assertTrue(mailServer.verify());
    }
}
