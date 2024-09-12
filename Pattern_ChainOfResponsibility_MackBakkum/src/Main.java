public class Main {

    public static void main(String[] args) {

        AbstractHandler loginHandler = new LoginHandler();
        AbstractHandler accountHandler = new AccountHandler();
        AbstractHandler orderHandler = new OrderHandler();

        loginHandler.setNextHandler(accountHandler);
        accountHandler.setNextHandler(orderHandler);

        System.out.println("Verzoek: Inlogprobleem");
        loginHandler.handleRequest("Inlogprobleem");

        System.out.println("\nVerzoek: Accountbeheer");
        loginHandler.handleRequest("Accountbeheer");

        System.out.println("\nVerzoek: Bestelling");
        loginHandler.handleRequest("Bestelling");

        System.out.println("\nVerzoek: Onbekend Onbekend Onbekend");
        loginHandler.handleRequest("Onbekend");
    }
}