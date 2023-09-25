public class ClientStub implements Client {
    private static final String CLIENT_EMAIL = "client@email.com";
    @Override
    public String getEmail() {
        return CLIENT_EMAIL;
    }
}
