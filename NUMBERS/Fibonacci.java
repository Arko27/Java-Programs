/* WAP to print the Fibonacci Series upto n terms
 * 
 * Input: n
 * Output: 0 1 1 2 3 5 8 ...... upto n
 */

import java.util.*;
class Fibonacci
{
    void main()
    {
        Scanner sc = new Scanner(System.in);
        int n,i;
        int a=0,b=1,c=0;
        System.out.println("Enter the value of n");
        n = sc.nextInt();
        System.out.println("The Fibonacci Series is: \n");
        System.out.print(a+" "+b+" ");
        for(i=3;i<=n;i++)
        {
            c = a + b;
            System.out.print(c+" ");
            a=b;
            b=c;
        }
    }
}