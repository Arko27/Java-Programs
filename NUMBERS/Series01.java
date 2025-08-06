/* WAP to print the sum of the series
 * s = x + x^2 + x^3 + x^4 + ...... + x^n
 */

import java.util.*;
class Series1
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        int n,i,x;
        double s=0.0;
        System.out.println("Enter the value of n");
        n = sc.nextInt();
        System.out.println("Enter the value of x");
        x = sc.nextInt();
        for(i=1;i<=n;i++)
        {
            s = s + Math.pow(x,i);
        }
        System.out.println(s);
    }
}