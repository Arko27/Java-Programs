import java.util.*;
class Special_No
{
    int fact(int x)
    {
        if(x==0)
        return 1;
        else
        return (x*fact(x-1));
    }
    void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a no.");
        int n=sc.nextInt();
        int c,f=0,n1=n;
        while(n>0)
        {
            c=n%10;
            f=f+fact(c);
            n=n/10;
        }
        if(n1==f)
        System.out.println(n1+" is a special no.");
        else
        System.out.println(n1+" is not a special no.");
    }
}