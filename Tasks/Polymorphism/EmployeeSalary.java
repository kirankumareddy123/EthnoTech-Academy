public class EmployeeSalary
{
    void calulateSalary()
    {
        System.out.println("Employees Salaries:");
    }
    class Intern extends EmployeeSalary
    {
        @Override
        void calulateSalary()
        {
            double salary = 25000.00;
            System.out.println("Intern Salary is: " + salary);
        }
    }
    class FullTimeEmployee extends EmployeeSalary
    {
        @Override
        void calulateSalary()
        {
            double salary = 55000.00;
            System.out.println("Full Time Employee Salary is: " + salary);
        }
    }
    class RemoteEmployee extends EmployeeSalary
    {
        @Override
        void calulateSalary()
        {
            double salary = 40000.00;
            System.out.println("Remote Employee Salary is: " + salary);
        }
    }
    class HybridEmployee extends EmployeeSalary
    {
        @Override
        void calulateSalary()
        {
            double salary = 75000.00;
            System.out.println("Hybrid Employee Salary is: " + salary);
        }
    }

    public static void main(String[] args)
    {   
    EmployeeSalary obj=new EmployeeSalary();
    obj.calulateSalary();
    Intern intern = obj.new Intern();
    intern.calulateSalary();
    FullTimeEmployee fullTimeEmployee = obj.new FullTimeEmployee();
    fullTimeEmployee.calulateSalary();
    RemoteEmployee remoteEmployee = obj.new RemoteEmployee();
    remoteEmployee.calulateSalary();
    HybridEmployee hybridEmployee = obj.new HybridEmployee();
    hybridEmployee.calulateSalary();
    }
}