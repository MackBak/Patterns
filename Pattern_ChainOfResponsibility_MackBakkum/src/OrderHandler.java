
class OrderHandler extends AbstractHandler {
    @Override
    public void handleRequest(String request) {

        if (request.equalsIgnoreCase("Bestelling")) {
            System.out.println("Van OrderHanlder:  Ik beheer het bestellings probleem");

        } else {
            if (nextHandler != null) {
                nextHandler.handleRequest(request);
            } else {
                System.out.println("Niks afgehandel in OrderHandler");
            }
        }
    }
}