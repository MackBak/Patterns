
import java.util.List;
import java.util.Arrays;

public class ExportProgram {

    public static void main(String[] args) {
        List<User> users = Arrays.asList(
                new User("Alice", "alice@example.com", 30),
                new User("Bob", "bob@example.com", 25),
                new User("Charlie", "charlie@example.com", 35)
        );

        Exporter exCSV = new ExporterCSV();
        Exporter exJSON = new ExporterJSON();
        Exporter exXML = new ExporterXML();

        System.out.println("\n\nUsers in CSV: \n");
        exCSV.export(users);
        System.out.println("\n\nUsers in JSON: \n");
        exJSON.export(users);
        System.out.println("\n\nUsers in XML: \n");
        exXML.export(users);
    }
}
