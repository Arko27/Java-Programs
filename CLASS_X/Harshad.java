/* WAP to input a no. and check whether it is a Harshad No. or not
 * [A harshad number is one such that it is divisible by the sum of its digits]
 * 
 * Input: 156  [1 + 5 + 6 = 12
 *              156 is divisible by 12]
 * Output: It is a Harshad No.
 */

import java.util.*;
class Harshad
{
    void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no.");
        int n=sc.nextInt();
        int rem,s=0,a=n;
        while(n>0)
        {
            rem = n%10;
            s = s + rem;
            n = n/10;
        }
        
        if(a%s == 0)
            System.out.println("Harshad No.");
        else
            System.out.println("Not a Harshad No.");
    }
}