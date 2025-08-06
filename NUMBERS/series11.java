import java.util.*;
class series1
{
    public static void main(String args[])
    {
        int i,a;
        double s=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value of a");
        a=sc.nextInt();
        for(i=0;i<=10;i++)
        {
            if(i%2==0)
            s=s+Math.pow(a,i);
            else
            s=s-Math.pow(a,i);
        }
        System.out.println(s);
    }
}