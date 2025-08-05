/* 1
 * 3 1
 * 5 3 1
 * 7 5 3 1
 * 9 7 5 3 1
 */ 

import java.util.*;
class pattern16
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        int i,j;
        for(i=1;i<=5;i++)
        {
            for(j=(2*i-1);j>=1;j-=2)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}