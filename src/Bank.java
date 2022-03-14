import java.util.Scanner;

public interface Bank   //creating an interface for banking functions
{
    void persloan(double a);
    void houseloan(double a);
    void eduloan(double a);
    void goldloan(double a);
}
class HDFC implements Bank   //creating a class for bank HDFC implementing Bank functions
{
    double amt,intr,gm;
    public void persloan(double a)     //method to calculate personal loan interest
    {
        this.intr=2.4;
        this.amt=a;
        System.out.println("\nInterest is:"+intr);
        System.out.println("\nAmount to be repayed is:"+((amt+(amt*intr))));   //calculating total amount after adding interest
        System.out.println("\nTime period to repay dept is 2.5 years");
    }
    public void houseloan(double a)  //method to calculate house loan interest
    {
        this.intr=3.4;
        this.amt=a;
        System.out.println("\nInterest is:"+intr);
        System.out.println("\nAmount to be repayed is:"+(amt+(amt*intr)));
        System.out.println("\nTime period to repay dept is 5 years");
    }
    public void eduloan(double a)   //method to calculate educational loan interest
    {
        this.intr=2.0;
        this.amt=a;
        System.out.println("\nInterest is:"+intr);
        System.out.println("\nAmount to be repayed is:"+(amt+(amt*intr)));
        System.out.println("\nTime period to repay dept is 4 years");
    }
    public void goldloan(double a)  // method to calculate gold loan interest
    {
        this.intr=2.5;
        this.gm=a;
        this.amt=gm*50000;
        System.out.println("\nInterest is:"+intr);
        System.out.println("Amount for "+gm+" mg of gold is:"+amt);   //calculating value for the quantity of gold entered
        System.out.println("\nAmount to be repayed is:"+(amt+(amt*intr)));   //calculating total amount with inerest
        System.out.println("\nTime period to repay dept is 3 years");
    }

}

class SBI implements Bank   //creating a class for bank SBI implementing Bank functions
{
    double amt,intr,gm;
    public void persloan(double a)
    {
        this.intr=2.7;
        this.amt=a;
        System.out.println("\nInterest is:"+intr);
        System.out.println("\nAmount to be repayed is:"+(amt+(amt*intr)));
        System.out.println("Time period to repay dept is 3 years");
    }
    public void houseloan(double a)
    {
        this.intr=2.9;
        this.amt=a;
        System.out.println("\nInterest is:"+intr);
        System.out.println("\nAmount to be repayed is:"+(amt+(amt*intr)));
        System.out.println("\nTime period to repay dept is 5 years");
    }
    public void eduloan(double a)
    {
        this.intr=1.5;
        this.amt=a;
        System.out.println("\nInterest is:"+intr);
        System.out.println("\nAmount to be repayed is:"+(amt+(amt*intr)));
        System.out.println("\nTime period to repay dept is 4 years");
    }
    public void goldloan(double a)
    {
        this.intr=1.5;
        this.gm=a;
        this.amt=gm*50000;
        System.out.println("\nInterest is:"+intr);
        System.out.println("Amount for "+gm+" mg of gold is:"+amt);
        System.out.println("\nAmount to be repayed is:"+(amt+(amt*intr)));
        System.out.println("Time period to repay dept is 3.5 years");
    }

}

class Details
{
    public static void main(String[] args)
    {
        double cost;
        String name;
        int ch,cn;
        Scanner in=new Scanner(System.in);   //using scanner class to get inputs
        System.out.println("\nEnter your name:");
        name=in.nextLine();
        System.out.println("\nSelect the Bank:\n1.HDFC\tSBI");
        ch= in.nextInt();
        Bank b=new SBI();
        switch (ch)
        {
            case 1:b=new HDFC();  //creating object for HDFC bnk
            break;
            case 2:b=new SBI();  //creating object for SBI bank
            break;
            default:
                System.out.println("\nInvalid Choice!!!!!");
                break;
        }
        System.out.println("\nSelect the type of loan:\n1.PERSONAL LOAN\t2.HOUSE LOAN\t3.EDUCATION LOAN\t4.GOLD LOAN");
        cn= in.nextInt();

        switch (cn)
        {
            case 1: System.out.println("\nEnter the amount:");
                cost= in.nextDouble();
                System.out.println("Dear "+name+" \nYour Interest Details Are given below: ");
                b.persloan(cost);       //calling the method by passing the amount as parameter
                break;
                
            case 2:System.out.println("\nEnter the amount:");
            cost= in.nextDouble();
                System.out.println("Dear "+name+" \nYour Interest Details Are given below: ");
            b.houseloan(cost);
            break;
                
            case 3:System.out.println("\nEnter the amount:");
            cost= in.nextDouble();
                System.out.println("Dear "+name+" \nYour Interest Details Are given below: ");
            b.eduloan(cost);   
            break;
                
            case 4:System.out.println("\nEnter the gold amount in mg:");
            cost= in.nextDouble();
            b.goldloan(cost);       //calling the method by passing the quantity of gold as parameter
            break;
                
            default:
                System.out.println("Ivalid Choice!!!!!");
                break;
        }
    }
}
