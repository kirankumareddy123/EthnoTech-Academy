
/*class Encapsulation
{
	private int id;
	public void setId(int id)
	{
		this.id=id;
	}
	public int getId()
	{
		return id;
	}
	public static void main(String args[])
	{
		Student obj=new Student();
		obj.setId(66);
		System.out.println(obj);
		System.out.println(obj.getId());
	}
}
*/

class Encapsulation
{
	public static void main(String args[])
	{
		Encapsulation obj = new Encapsulation();
		obj.deposit(1000);
		System.out.println(obj.withDraw(5000));
	}
	private int balance; //encapsulation
	
	public void deposit(int bal) //renamed
	{
		this.balance=bal;
	}
	public int withDraw(int bal)
	{
		return balance-bal;
	}
}