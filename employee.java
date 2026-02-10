import java.util.*;
class employee
{
    int id;
    String name;
    float salary;
    public void get()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter id:");
        id=sc.nextInt();
        System.out.print("Enter name:");
        name=sc.next();
        System.out.print("Enter salary:");
        salary=sc.nextFloat();

    }
    public void display()
    {
        System.out.println("id:"+id);
        System.out.println("name:"+name);
        System.out.println("salary:"+salary);
    }
    public static void main(String[] args)
    {
        employee e1=new employee();
        e1.get();
        e1.display();

        employee e2=new employee();
        e2.get();
        e2.display();

        employee e3=new employee();
        e3.get();
        e3.display();
    }
}