import java.util.*;
class palinrome
{
    void main()
    {
        Scanner sc=new Scanner (System.in);
        int a,r=0,c;
        System.out.println("Enter the number");
        a=sc.nextInt();
        int n=a;
        while(a>0)
        {
        c=a%10;
        r=r*10+c;
        a=a/10;
    }
        if(r==n)
            System.out.println("it is a palindrome number");
            else
            System.out.println("it is not a palindrome number");
    }
}

    
    
        
        