
class AccountHandler extends AbstractHandler {

    @Override
    public void handleRequest(String request) {

        if (request.equalsIgnoreCase("Accountbeheer")) {
            System.out.println("Van AccountHandler:  Ik beheer het accountbeheer probleem");

        } else {
            if (nextHandler != null) {
                nextHandler.handleRequest(request);
            } else {
                System.out.println("Niks afgehandel in AccountHandler");
            }
        }
    }
}