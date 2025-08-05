import java.util.*;
class Num10
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        int a,b,i,d=1;
        System.out.println("enter the base ");
        a=sc.nextInt();
        System.out.println("enter the power");
        b=sc.nextInt();
        for(i=1;i<=b;i++)
        {
            d=d*a;
        }
        System.out.println(d);
    }
}