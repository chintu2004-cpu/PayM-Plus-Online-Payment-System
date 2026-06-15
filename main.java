import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== ONLINE MULTIPLE PAYMENT SYSTEM =====");

        System.out.print("Enter User Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Amount: ");
        double amount = sc.nextDouble();

        System.out.println("\nChoose Payment Method");
        System.out.println("1. UPI");
        System.out.println("2. Card");
        System.out.println("3. Net Banking");

        int choice = sc.nextInt();

        PaymentService service = new PaymentService();
        service.processPayment(name, amount, choice);
    }
}
