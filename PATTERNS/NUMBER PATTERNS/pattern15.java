/* *
 * # #
 * * * *
 * # # # #
 */

import java.util.*;
class pattern15
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        int i,j;
        for(i=1;i<=4;i++)
        {
            for(j=1;j<=i;j++)
            {
                if(i%2==0)
                System.out.print("#"+" ");
                else
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}