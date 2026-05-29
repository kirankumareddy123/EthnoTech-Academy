/*class Parent 
{
	void properties()
	{
		System.out.println("Giving properties to the child of my son");
	}
}
class Son extends Parent
{
	void access()
	{
		System.out.println("Accessing properties from my parent & im a son");
	}
}
class Inheritance
{
	public static void main(String args[])
	{
		Son obj=new Son();
		obj.properties();
		obj.access();
	}
}*/


class Company
{
	public String company="Kahoot IT Solutions";
	public String empType="Permanent";
	void location()
	{
		System.out.println("Company is "+company);
	}
}
class Employee extends Company
{
	void developer()
	{
		String type="Developer";
		double salary=66000.00;
		System.out.println("Employee is a "+type);
		System.out.println("Employee salary is "+salary);
		System.out.println("Employee type is "+empType);
		System.out.println("Employee is working in "+company);
	}
}
class Employee1 extends Employee
{
	void tester()
	{
		String type="Tester";
		double salary=75000.00;
		System.out.println("Employee is a "+type);
		System.out.println("Employee salary is "+salary);
		System.out.println("Employee type is "+empType);
		System.out.println("Employee is working in "+company);
	}
}
class Inheritance
{
	public static void main(String args[])
	{
		Employee1 obj=new Employee1();
		obj.location();
		obj.developer();
		obj.tester();
	}
}