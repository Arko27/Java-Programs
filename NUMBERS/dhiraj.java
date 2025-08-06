import java.util.*;
class dhiraj
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,x,i;
        double s=0;
        System.out.println("Enter the value of x & n");
        x=sc.nextInt();
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            s=s+(i*Math.pow(x,2));
            System.out.println(s);
        }
    }
}