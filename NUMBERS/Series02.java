// s = 1 + 1/2 + 1/4 + 1/8 + 1/16 + ..... upto n terms.

import java.util.*;
class Series2
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        double s=0.0;
        int i,n;
        System.out.println("Enter the value of n");
        n = sc.nextInt();
        for(i=0;i<n;i++)
        {
            s = s + 1/Math.pow(2,i);
        }
        System.out.println("The sum is: "+s);
    }
}