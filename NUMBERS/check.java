import java.util.*;
class check
{
    static int checkPrime(int n)
    {
        int i,c=0;
        for (i=1;i<=n;i++)
        {
            if(n%i==0)
            c++;
        }
        if(c==2)
        return(1);
        else
        return(0);
    }
    static int checkPalindrome(int n)
    {
        int a,v,s=0;
        v=n;
        while(n>0)
        {
            a=n%10;
            s=s*10+a;
            n=n/10;
        }
        if (v==s)
        return(1);
        else
        return(0);
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int a=checkPrime(n);
        int b=checkPalindrome(n);
        if((a==1)&&(b==1))
        System.out.println("Prime Palindrome");
        else
        System.out.println("Not Prime Palindrome");
    }
}