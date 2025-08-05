import java.util.*;
class series3
{
    void main()
    {
        Scanner sc=new Scanner (System.in);
        int n,i;
        double s=0;
        System.out.println("Enter the number");
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            if(i%2==0)
            s=s-1/Math.pow(2,i);
            else
            s=s+1/Math.pow(2,i);
        }
        System.out.println(s);
    }
}
            