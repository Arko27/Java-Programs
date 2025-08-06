/* 0
 * 0 1
 * 0 1 4
 * 0 1 4 9 
 * 0 1 4 9 16
 */

import java.util.*;
class pattern10
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        int i,j;
        for(i=0;i<=4;i++)
        {
            for(j=0;j<=i;j++)
            {
                System.out.print(j*j+" ");
            }
            System.out.println();
        }
    }
}