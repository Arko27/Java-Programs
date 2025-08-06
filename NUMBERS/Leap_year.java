import java.util.*;
class Leap_year
{
    void main ()
    {
        Scanner sc=new Scanner(System.in);
        int a;
        System.out.println("enter the year");
        a=sc.nextInt();
        if(a%400==0)
        System.out.println("it is a leap year");
        else if(a%4==0 && a%100!=0)
        System.out.println("it is a leap year");
        else
        System.out.println("not a leap year");
    }
}
        
        
    