import java.util.UUID;

public class PaymentService {

    public void processPayment(String user, double amount, int method) {

        String paymentMethod = "";

        switch(method) {
            case 1:
                paymentMethod = "UPI";
                break;
            case 2:
                paymentMethod = "CARD";
                break;
            case 3:
                paymentMethod = "NET BANKING";
                break;
            default:
                System.out.println("Invalid Payment Method");
                return;
        }

        String transactionId =
                UUID.randomUUID().toString().substring(0,10);

        Transaction txn =
                new Transaction(transactionId,
                        user,
                        amount,
                        paymentMethod,
                        "SUCCESS");

        txn.displayReceipt();
    }
}
