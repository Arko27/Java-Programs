//happy number 
import java.util.*;
class happy
{
    void main()
    {
        Scanner sc= new Scanner(System.in);
        int a,c,s=0;
        
        System.out.println("enter the number");
        a=sc.nextInt();
        while(a>9)
        {
            while(a>0)
            {
                c=a%10;
                s=s+c*c;
                a=a/10;
            }
            a=s;
            s=0;
        }
        
        if(a==1)
        System.out.println("It is a happy number");
        else
        System.out.println("It is not a happy number");
    }
}