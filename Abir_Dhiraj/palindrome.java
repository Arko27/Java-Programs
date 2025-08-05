import java.util.*;
class palindrome
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        int n,r=0,rev=0;
        System.out.println("Enter the number");
        n=sc.nextInt();
        int a=n;
        while(n>0)
        {
            r=n%10;
            rev=rev*10+r;
            n=n/10;
        }
        if(a==rev)
        System.out.println("It is a palindrome number");
        else
        System.out.println("It is not a palindrome number");
    }
}