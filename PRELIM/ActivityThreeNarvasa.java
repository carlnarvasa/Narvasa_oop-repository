import java.util.Scanner;

public class ActivityThreeNarvasa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        double[] menuPrices = {100.00, 150.00, 200.00};
        double[] addOnPrices = {35.00, 50.00};

       
        
        System.out.println("Menu:");
        System.out.println("C1. Php 100.00");
        System.out.println("C2. Php 150.00");
        System.out.println("C3. Php 200.00");
        System.out.println("R1. Php 35.00");
        System.out.println("R2. Php 50.00");

        System.out.print("Enter your order: ");
        String orderCode = scanner.next();

        System.out.print("Enter quantity: ");
        int quantity = scanner.nextInt();

        double totalPrice = 0;

       
        if (orderCode.equals("C1")) {
            totalPrice = menuPrices[0] * quantity;
        } else if (orderCode.equals("C2")) {
            totalPrice = menuPrices[1] * quantity;
        } else if (orderCode.equals("C3")) {
            totalPrice = menuPrices[2] * quantity;
        } else if (orderCode.equals("R1")) {
            totalPrice = addOnPrices[0] * quantity;
        } else if (orderCode.equals("R2")) {
            totalPrice = addOnPrices[1] * quantity;
        } else {
            System.out.println("Invalid order code!");
            return;
        }

        double phpToDollarsConvertRate = 56.00;
        double totalPriceInDollars = totalPrice / phpToDollarsConvertRate;

        System.out.println("Total Price in Php: Php " + totalPrice);
        System.out.println("Total Price in $  : $" + totalPriceInDollars);
        System.out.println("Total Quantity: " + quantity);
        System.out.println("orderCode " + orderCode);
    }
}
