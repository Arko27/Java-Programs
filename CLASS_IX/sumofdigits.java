import java.util.*;
class sumofdigits
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner(System.in);
        int r,n,i,s=0,p;
        System.out.println(" enter a number");
        n=sc.nextInt();
        while(n>0)
        {
            r=n%10;
            s=s+r;
            n=n/10;
        }
        System.out.println(s);
    }
}