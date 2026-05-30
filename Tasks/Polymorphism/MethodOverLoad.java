public class MethodOverLoad {
    void display(int num)
    {
        System.out.println("Method with integer parameter: " + num);
    }
    void display(int num1, int num2)
    {
        System.out.println("Method with two integer parameters: " + num1 + ", " + num2);
        System.out.println(num1+num2);
    }
    void display(String str1,String str2)
    {
        System.out.println("Method with string parameter: " + str1 + ", " + str2);
        System.out.println(str1+str2);
    }
    void display(double num1, double num2)
    {
        System.out.println("Method with double parameter: " + num1 + ", " + num2);
        System.out.println(num1+num2);
    }
public static void main(String[] args)
    {
        MethodOverLoad obj = new MethodOverLoad();
        obj.display(10);
        obj.display(20, 30);
        obj.display("Hello", "World");
        obj.display(3.14, 2.71);
    }
}
