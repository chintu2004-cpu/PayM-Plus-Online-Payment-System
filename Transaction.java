public class Transaction {

    private String transactionId;
    private String user;
    private double amount;
    private String paymentMethod;
    private String status;

    public Transaction(String transactionId,
                       String user,
                       double amount,
                       String paymentMethod,
                       String status) {

        this.transactionId = transactionId;
        this.user = user;
        this.amount = amount;
        this.paymentMethod = paymentMethod;
        this.status = status;
    }

    public void displayReceipt() {

        System.out.println("\n===== PAYMENT RECEIPT =====");
        System.out.println("Transaction ID : " + transactionId);
        System.out.println("User           : " + user);
        System.out.println("Amount         : ₹" + amount);
        System.out.println("Method         : " + paymentMethod);
        System.out.println("Status         : " + status);
    }
}
