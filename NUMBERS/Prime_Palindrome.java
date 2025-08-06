import java.util.*;
class Prime_Palindrome
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        int n,s=0,a,v,c=0,i;
        System.out.println("ENTER A NUMBER");
        n=sc.nextInt();
        v=n;
        while(n>0)
        {
            a=n%10;
            s=s*10+a;
            n=n/10;
        } 
        for(i=1;i<=v;i++)
        {
            if(v%i==0)
                c++;
        }
        
        if(s == v && c == 2)
        System.out.println("It is Prime Palindrome");
        else
        System.out.println("It is not Prime Palindrome");
    }
}