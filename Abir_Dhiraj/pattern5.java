/* 5 4 3 2 1
 * 5 4 3 2
 * 5 4 3
 * 5 4
 * 5
 */

import java.util.*;
class pattern5
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        int i,j;
        for(i=1;i<=5;i++)
        {
            for(j=5;j>=i;j--)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}