/* 15 14 13 12 11
 * 10 9 8 7
 * 6 5 4
 * 3 2
 * 1
 */

import java.util.*;
class pattern17
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        int i,j,c=15;
        for(i=5;i>=1;i--)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(c+" ");
                c--;
            }
            System.out.println();
        }
    }
}