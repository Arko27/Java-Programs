import java.util.*;
class diff
{
    void main()
    {
        Scanner sc=new Scanner (System.in);
        int a,b,c;
        System.out.println("enter the first number");
        a=sc.nextInt();
        System.out.println("enter the second number");
        b=sc.nextInt();
        if(a>b)
        {
            c=a-b;
            System.out.println(c);
        }
        else if(b>a)
        {
            c=b-a;
            System.out.println(c);
        }
    }
}
            