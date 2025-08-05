import java.util.*;
class Automorphic_No
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a no.");
        int n=sc.nextInt();
        int sq=n*n;
        int c=0,copy=n;
        while(copy>0)
        {
            c++;
            copy=copy/10;
        }
        int end=sq%(int)Math.pow(10,c);
        if(n==end)
        System.out.println(n+" is an Automorphic No.");
        else
        System.out.println(n+" is not an Automorphic No.");
    }
}