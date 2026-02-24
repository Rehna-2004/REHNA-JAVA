import java.util.*;
class employee
{
    int empid;
    String name;
    float salary;
    String address;

    employee()
    {
    }

    employee(int empid, String name, float salary, String address)
    {
        this.empid = empid;
        this.name = name;
        this.salary = salary;
        this.address = address;
    }
    }

    class Teacher extends employee
    {
        String dept,sub;
        Teacher(int empid,String name,float salary,String address,String dept,String sub)
        {
            super(empid,name,salary,address);
            this.dept=dept;
            this.sub=sub;
        }
        public void display()
        {
            System.out.println("Employee id: "+empid);
            System.out.println("Employee name: "+name);
            System.out.println("Employee salary: "+salary);
            System.out.println("Employee address: "+address);
            System.out.println("Employee department: "+dept);
            System.out.println("Employee subject: "+sub);
        }
    }
    public class teachersingle
    {
        public static void main(String args[])
        {
            
          
            Scanner sc1=new Scanner(System.in);
            int tid;
            String name;
            float salary;
            String add;
            String dept,sub;
            for(int i=0;i<n;i++)
             {
                System.out.println("Enter teacher id:");
                tid=sc1.nextInt();
             
                System.out.println("Enter teacher name:");
                name=sc1.next();

                System.out.println("Enter teacher salary:");
                salary=sc1.nextFloat();
              
                System.out.println("Enter teacher address:");
                add=sc1.next();

                System.out.println("Enter teacher department:");
                dept=sc1.next();

                System.out.println("Enter teacher subject:");
                sub=sc1.next();

                Teacher t1=new Teacherher(tid,name,salary,add,dept,sub);
             }


             System.out.println("Teacher details:");
                t1.display();
        }
    }

