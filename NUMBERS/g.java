import java.util.*;
class g
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        int i,n,f=1,x;
        double s=0.0;
        System.out.println("enter the value of x & n");
        n=sc.nextInt();
        x=sc.nextInt();
        for(i=1;i>=n;i++)
        {f=i*f;
            s=s+ Math.pow(x,i)/f;
        }
        System.out.println(s);
    }}