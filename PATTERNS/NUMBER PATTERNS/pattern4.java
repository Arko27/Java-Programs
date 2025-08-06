/* 1 2 3 4
 * 1 2 3 
 * 1 2
 * 1
 */

import java.util.*;
class pattern4
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        int i,j;
        for(i=4;i>=1;i--)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}