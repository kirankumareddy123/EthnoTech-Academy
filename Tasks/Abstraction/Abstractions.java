
abstract class FoodOrder
{
    String customerName;
    String foodItem;
    int quantity;
    double price;
    FoodOrder()
    {
        System.out.println("Welcome to the Food Order System...!");
    }
    FoodOrder(String name,String item, int quan,double cost)
    {
        this.customerName = name;
        this.foodItem = item;
        this.quantity = quan;
        this.price = cost;
    }
    abstract void OrderFood();

    public void displayOrder()
    {
        System.out.println("Customer Name: "+customerName);
        System.out.println("Food Item: "+foodItem);
        System.out.println("Quantity: "+quantity);
        System.out.println("Price: "+price);
    }
}
class Order extends FoodOrder
{
    public void OrderFood()
    {
        System.out.println("Food order placed successfully...!");
    }
    @Override
    public void displayOrder()
    {
        super.displayOrder();
        System.out.println("Total Cost: "+(quantity*price));
        System.out.println("Order Details are : "+customerName+" ordered "+quantity+" "+foodItem+"(s) at $"+price+" each.");
    }
}

class Abstractions
{
    public static void main(String args[])
    {
        Order var1 = new Order();
        var1.customerName = "Kiran";
        var1.foodItem = "Pizza";
        var1.quantity = 2;
        var1.price = 15.99;
        var1.OrderFood();
        var1.displayOrder();
    }
}
