/* * * * *
 * * * *
 * * * 
 * *
 */

import java.util.*;
class pattern7
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        int i,j;
        for(i=4;i>=1;i--)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}