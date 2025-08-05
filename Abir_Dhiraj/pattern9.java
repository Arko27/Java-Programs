/* 1
 * 2 3
 * 4 5 6
 * 7 8 9 10
 */

import java.util.*;
class pattern9
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        int i,j,c=1;
        for(i=1;i<=4;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(c+" ");
                c++;
            }
            System.out.println();
        }
    }
}