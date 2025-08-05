import java.util.*;
class proEven
{
    void main()
    {
        Scanner sc = new Scanner(System.in);
        int n,rem,p=1;
        System.out.println("Enter a no.:");
        n = sc.nextInt();
        
        while(n>0)
        {
            rem = n%10;
            if(rem%2 == 0)
            p = p*(rem+1);
            n = n/10;
        }
        
        System.out.println("The product of successor of even digits is: "+p);
    }
}