import java.util.*;
class perfect_number
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,a,s=0,i;
        System.out.println("Enter a number");
        n=sc.nextInt();
        for(i=1;i<n;i++)
        { 
            if(n%i==0)
            s=s+i;
        }
        if(s==n)
        System.out.println("PERFECT NUMBER");
        else
        System.out.println("NOT PERFECT NUMBER");
    }
}
            