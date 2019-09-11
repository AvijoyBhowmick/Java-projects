import java.util.*;
class increment
{
    double basic,age;
    String name;

    increment(double bs,double a,String n)
    {
        basic=bs;
        age=a;
        name=n;
    }

    void calculate()
    {
        if (age<45) {
            basic = (basic + (.10 * basic));
        }
        if (age>45 && age<56) {
            basic = (basic + (.15 * basic));
        }
        if (age>=56) {
            basic = (basic + (.20));
        }
    }

    void display()
    {
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Basic: "+basic);
    }
}

class result {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Name");
        String n=sc.nextLine();
        System.out.println("Enter the Age");
        Double a=sc.nextDouble();
        System.out.println("Enter the Basic Salary");
        Double bs=sc.nextDouble();
        increment obj=new increment(bs,a,n);
        obj.calculate();
        obj.display();
    }
}
