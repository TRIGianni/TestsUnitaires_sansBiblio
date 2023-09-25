public class TemplateEngineStub implements TemplateEngine{
    private static final String MSG_CONTENT = "Important message";
    @Override
    public String prepareMessage(Template template, Client client) {
        return MSG_CONTENT;
    }
}
