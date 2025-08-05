import java.util.*;
class palindrome
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        int i,r=0,n,c;
        System.out.println("Enter the no.");
        n=sc.nextInt();
        c=n;
        while(n>0)
        {
        i=n%10;
        r=r*10+i;
        n=n/10;
    }
    if(c==r)
    System.out.println("Palindrome");
    else
    System.out.println("not");
}
}
        
        
        