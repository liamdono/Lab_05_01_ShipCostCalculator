import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double priceOfItem = 0;

        while (true) {
            System.out.print("What is the items price? ");

            try {
                priceOfItem = Double.parseDouble(scanner.nextLine());

                if (priceOfItem > 0) {
                    break;
                }
                else
                {
                    System.out.println("Input is invalid. Number must be positive.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Input is invalid. Number entered must be valid.");
            }
        }

        double shippingCost = getShippingCost(priceOfItem);
        double totalPrice = getTotalPrice(priceOfItem, shippingCost);

        System.out.printf("Shipping cost: $%.2f\n", shippingCost);
        System.out.printf("Total price: $%.2f\n", totalPrice);
    }

    public static double getShippingCost(double priceOfItem) {
        if (priceOfItem >= 100) {
            return 0;
        }
        else
        {
            return priceOfItem * 0.02;
        }
    }

    public static double getTotalPrice(double priceOfItem, double shippingCost) {
        return priceOfItem + shippingCost;
    }
}