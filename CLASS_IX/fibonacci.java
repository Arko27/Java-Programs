import java.util.*;
class fibonacci
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,a=0,b=1,c=0,i;
        System.out.println("Enter the value of n");
        n=sc.nextInt();
        System.out.println(a);
        System.out.println(b);
        for(i=3;i<=n;i++)
        {
            c=a+b;
            a=b;
            b=c;
            System.out.println(c);
        }
    }
}