class Bank
{
    protected int accountNumber;
    protected double balance;
    protected double depositAmount;
    protected double withdrawAmount;
    protected String accountHolderName;
    public Bank()
    {
        this.accountNumber =0;
        this.balance =5000.0;
        this.depositAmount = 0.0;
        this.withdrawAmount = 0.0;
        this.accountHolderName = "";
    }
}
class Deposit extends Bank {
    public void depositAmount(int accNum,double amo,String name){
        this.depositAmount = amo;
        this.balance = balance+amo;
        this.accountNumber = accNum;
        this.accountHolderName = name;
    }
    public void displaydeposit()
    {
        System.out.println("account number: "+accountNumber);
        System.out.println("balance: "+balance);
        System.out.println("amount deposited: "+depositAmount);
        System.out.println("account holder name: "+accountHolderName);
    }
}
class WithDraw extends Deposit {
    public void withdrawAmount(int accNum,double amo){
        this.withdrawAmount = amo;
        this.balance = balance-amo;
        this.accountNumber = accNum;
    }
    public void displaywithdraw()
    {
        System.out.println("amount withdrawn: "+withdrawAmount);
        System.out.println("account number: "+accountNumber);
        System.out.println("balance: "+balance);
    }
}
class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the Bank!");
        WithDraw obj = new WithDraw();
        obj.depositAmount(12345, 5000.0, "Kiran");
        obj.displaydeposit();
        obj.withdrawAmount(12345, 1000.0);
        obj.displaywithdraw();

    }
    
}