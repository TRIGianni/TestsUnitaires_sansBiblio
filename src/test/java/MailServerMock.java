public class MailServerMock implements MailServer{
    private boolean sendWasCalled = false;
    @Override
    public void send(String mail, String msg) {
sendWasCalled =true;

    }
public boolean verify(){
        return sendWasCalled;
}

}
