public class ExporterXML extends Exporter {

    @Override
    protected String getHeader() {
        return "<users>\n";
    }

    @Override
    protected String formatUser(User user) {
        return "  <user>\n    <name>" + user.getName() + "</name>\n    <email>" + user.getEmail() + "</email>\n    <age>" + user.getAge() + "</age>\n  </user>\n";
    }

    @Override
    protected String getFooter() {
        return "</users>";
    }
}
