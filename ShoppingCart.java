import java.util.Scanner;
public class ShoppingCart {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String item;
        double price;
        int quantity;
        char currency = '$';
        double total;

        System.out.print("What would you like to buy?: ");
        item = scanner.nextLine();
        System.out.print("Can you tell me the price on it: ");
        price = scanner.nextDouble();
        System.out.print("Alright! How much of it?: ");
        quantity = scanner.nextInt();

        total = price * quantity;
        System.out.println("Okay! You've ordered " + quantity + " " + item + "(s)");
        System.out.println("Your bill would be " + currency + total);


        scanner.close();
    }
}