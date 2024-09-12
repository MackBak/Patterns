public class ExporterCSV extends Exporter {

    @Override
    protected String getHeader() {
        return "";
    }

    @Override
    protected String formatUser(User user) {
        return user.getName() + "," + user.getEmail() + "," + user.getAge() + "\n";
    }

    @Override
    protected String getFooter() {
        return "";
    }
}
