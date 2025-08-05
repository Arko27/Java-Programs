/* 1
 * 3 5 
 * 7 9 11
 * 13 15 17 19
 */

import java.util.*;
class pattern14
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
                c= c+2;
            }
            System.out.println();
        }
    }
}