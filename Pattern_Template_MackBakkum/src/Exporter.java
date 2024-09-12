import java.util.List;

public abstract class Exporter {

    public final void export(List<User> users) {
        StringBuilder sbUserInfo = new StringBuilder();
        sbUserInfo.append(getHeader());
        for (User user : users) {
            sbUserInfo.append(formatUser(user));
        }
        sbUserInfo.append(getFooter());
        System.out.println(sbUserInfo);
    }

    protected abstract String getHeader();
    protected abstract String formatUser(User user);
    protected abstract String getFooter();
}
