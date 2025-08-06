import java.util.*;
class series
{
    void main()
    {
        Scanner sc=new Scanner (System.in);
        int a,i,s=0,f=1;
        System.out.println("Enter the number");
        a=sc.nextInt();
        for(i=1;i<=a;i++)
        {
            f=f*i;
            s=s+f;
        }
        System.out.println(s);
    }
}
