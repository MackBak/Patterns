public class ExporterJSON extends Exporter {

    @Override
    protected String getHeader() {
        return "[\n";
    }

    @Override
    protected String formatUser(User user) {
        return "  { \"name\": \"" + user.getName() + "\", \"email\": \"" + user.getEmail() + "\", \"age\": " + user.getAge() + " },\n";
    }

    @Override
    protected String getFooter() {
        return "]";
    }
}
