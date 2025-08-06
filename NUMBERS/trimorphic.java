import java.util.*;
class trimorphic
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,a,rem,r=0,last,cube;
        System.out.println("Enter any number");
        n=sc.nextInt();
        a=n;
        while (n>0)
        {
            rem=n%10;
            r=r+1;
            n=n/10;
        }
        cube=a*a*a;
        last=cube%((int)Math.pow(10,r));
        if(a==last)
        System.out.println("The number is a trimorphic number");
        else
        System.out.println("The number is not a trimorphic number");
    }
}
        
            
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        