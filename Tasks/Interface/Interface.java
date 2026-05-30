
interface BankCash 
{
    void deposit();
    void withdraw();

}
interface UPI
{
    void phonepay();
    void paytm();
}
class Payment implements BankCash, UPI
{
    int amount=0;
    public void balance()
    {
        System.out.println("Balance is "+amount);
    }
    public void deposit()
    {
        amount=amount+1000;
        System.out.println("Amount deposited "+amount);
    }
    public void phonepay()
    {
        System.out.println("Phonepay is used");
    }
    public void withdraw()
    {
        amount=amount-500;
        System.out.println("Amount withdrawn "+amount);
    }
    public void paytm()
    {
        System.out.println("Paytm is used");
    }
}
class Interface
{
    public static void main(String args[])
    {
        Payment p = new Payment();
        p.balance();
        p.deposit();
        p.phonepay();
        p.withdraw();
        p.paytm();
    }
}

