import java.util.*;
class Pronic_Automorphic
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        int i,n,ch;
        System.out.println("Enter 1 for Pronic No and 2 for Automorphic No.");
        System.out.println("Enter Your Choice");
        ch = sc.nextInt();
        System.out.println ("Enter any number");
        n = sc.nextInt();
        switch(ch)
        {
            case 1:
            int f = 0;
            for(i=1;i<=n;i++)
            {
                if(n == i*(i+1))
                {
                    f = 1;
                    break;
                }
            }
            if (f == 1)
            System.out.println(n + " is a Pronic Number");
            else 
            System.out.println(n + " is not a Pronic Number");
            break;
            
            case 2:
            int sq = n*n;
            int c = 0,copy = n;
            while(copy>0)
            {
                c++;
                copy=copy/10;
            }
            
            int end=sq%(int)Math.pow(10,c);
            if(n==end)
            System.out.println(n + " is an Automorphic No.");
            else
            System.out.println(n + " is not an Automorphic No.");
            break;
            
            default:
            System.out.println("Wrong Choice");
        }
    }
}