import java.util.*;
class countDig
{
    void main()
    {
        Scanner sc = new Scanner(System.in);
        int n,rem,c=0;
        System.out.println("Enter a no.:");
        n = sc.nextInt();
        
        while(n>0)
        {
            rem = n%10;
            c++;
            n = n/10;
        }
        
        System.out.println("Number of Digits = "+c);
        
        if(c%2 == 0)
        System.out.println("The number contains even number of digits");
        else
        System.out.println("The number contains odd number of digits");
    }
}