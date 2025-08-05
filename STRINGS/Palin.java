import java.util.*;
class Palin
{
    void main()
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter a no");
        int n=sc.nextInt();
        int n1=n;
        int rem,rev=0;
        while(n>0)
        {
            rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        if(n1==rev)
        System.out.println("Palindrome");
        else
        System.out.println("Not Palindrome");
    }
}