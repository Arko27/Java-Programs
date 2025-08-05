import java.util.*;
class CI
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the principal amount");
        double p=sc.nextDouble();
        System.out.println("Enter the rate");
        double r=sc.nextDouble();
        System.out.println("Enter the time");
        double t=sc.nextDouble();
        System.out.println("Enter the no. of times the interset is compounded");
        int n=sc.nextInt();
        double A=p*(Math.pow(1+((r/100)/n),(n*t)));
        System.out.println("The Amount to be paid is "+A);
    }
}