
import java.util.Scanner;

abstract class Items {

    protected String[] itemNames;
    protected double[] itemPrices;
    protected int quantity;
    protected double totalCost;

    public Items() {

        itemNames = new String[] {
            "Pizza",
            "Burger",
            "Pasta",
            "CoCola",
            "Pepsi",
            "Sprite",
            "Biryani",
            "Samosa",
            "Ice Cream",
            "Mojito"
        };

        itemPrices = new double[] {
            60.0,
            40.0,
            50.0,
            20.0,
            18.0,
            15.0,
            80.0,
            10.0,
            25.0,
            35.0
        };

        System.out.println("\n========== Welcome to Menu System ==========");
    }

    public abstract void displayMenu();

    public abstract void calculateCost(int itemNumber, int qty);

    public void printBill()
    {
        System.out.println("\n----------- Order Details -----------");
        System.out.println("Total Cost : " + totalCost);
    }
}

class Order extends Items
{

    @Override
    public void displayMenu() 
    {
        System.out.println("\n========== Available Items ==========");
        for (int i = 0; i < itemNames.length; i++)
        {
            System.out.println((i + 1) + ". " + itemNames[i] + " - Rs. " + itemPrices[i]);
        }
        System.out.println("====================================\n");
    }

    @Override
    public void calculateCost(int itemNumber, int qty)
    {
        if (itemNumber >= 1 && itemNumber <= itemNames.length)
        {
            quantity = qty;
            totalCost = itemPrices[itemNumber - 1] * quantity;
            System.out.println("\nOrder Placed Successfully!");
            System.out.println("Item: " + itemNames[itemNumber - 1]);
            System.out.println("Unit Price: Rs. " + itemPrices[itemNumber - 1]);
            System.out.println("Quantity: " + quantity);
            System.out.println("Total Cost: Rs. " + totalCost);
        }
        else
        {
            System.out.println("Invalid Item Number Selected!");
            totalCost = 0;
        }
    }

    @Override
    public void printBill()
    {
        super.printBill();
        System.out.println("\nThank You For Your Order!");
        System.out.println("Visit Again!");
    }
}

public class Abs {

    public static void main(String[] args)
    {

        Order order = new Order();
        order.displayMenu();

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Item Number (1-10): ");
        int itemNumber = sc.nextInt();

        System.out.print("Enter Quantity: ");
        int quantity = sc.nextInt();

        order.calculateCost(itemNumber, quantity);
        order.printBill();

        sc.close();
    }
}
