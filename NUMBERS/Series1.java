/* WAP to print the following series:
 * 
 * s = 1 - x^2/2! + x^4/4! - x^6/6! + ..... x^n/n!
 */

import java.util.*;
class Series1
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        int x,n,i,j=1,f=1,k;
        double s=0.0;
        System.out.println("Enter the value of x");
        x=sc.nextInt();
        System.out.println("Enter the value of n");
        n=sc.nextInt();
        for(i=1;i<n;i++)
        {
            for(k=1;k<=2*i;k++)
                f=f*k;
            if(i%2!=0)
                s = s - (Math.pow(x,2*i)/f);
            else
                s = s + (Math.pow(x,2*i)/f);
        }
        System.out.println("The sum of the series is: "+(s+1));
    }
}