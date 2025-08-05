import java.util.*;
class Leap
{
    void main()
    {
        Scanner sc=new Scanner (System.in);
        int a;
        System.out.println("enter the year");
        a=sc.nextInt();
        if(a%400==0)
        System.out.println("It is a leap year");
        else if(a%4==0 && a%100!=0)
        System.out.println("It is a leap year");
        else
        System.out.println("it is not a leap year");
    }
}
        