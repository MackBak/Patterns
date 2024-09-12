
class LoginHandler extends AbstractHandler {

    @Override
    public void handleRequest(String request) {

        if (request.equalsIgnoreCase("Inlogprobleem")) {
            System.out.println("Van LoginHandler:  Ik beheer het login probleem");

        } else {
            if (nextHandler != null) {
                nextHandler.handleRequest(request);
            } else {
                System.out.println("Niks afgehandel in LoginHandler");
            }
        }
    }
}