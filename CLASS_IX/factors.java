import java.util.*;
class factors
{
    public static void main(String args[])
    {
        int n,i,c=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value of n");
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            if(n%i==0)
            System.out.println(i);
        }
    }
}    