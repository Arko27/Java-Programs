/* 1
 * 1 0
 * 1 0 1
 * 1 0 1 0 
 */

import java.util.*;
class pattern11
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        int i,j;
        for(i=1;i<=4;i++)
        {
            for(j=1;j<=i;j++)
            {
                if(j%2==0)
                System.out.print("0"+" ");
                else
                System.out.print("1"+" ");
            }
            System.out.println();
        }
    }
}