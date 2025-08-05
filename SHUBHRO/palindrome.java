import java.util.*;
class palindrome 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        int n,z,a,l=0;
        System.out.println("ENTER A NUMBER");
        n=sc.nextInt();
        z=n;
        while(n>0)
        { 
            a=n%10;
            l=l*10+a;
            n=n/10;
        }
        if(l==z)
        System.out.println("Palindrome number");
        else
        System.out.println("Not palindrome");
    }
}