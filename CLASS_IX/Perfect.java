import java.util.*;
class Perfect
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        int i,s=0,n;
        System.out.println("enter the no.");
        n=sc.nextInt();
        for(i=1;i<n;i++)
        {
            if(n%i==0)
            s=s+i;
        }
        if(s==n)
        System.out.println("it is a perfect no.");
        else
        System.out.print("it is not");
    }
}
 