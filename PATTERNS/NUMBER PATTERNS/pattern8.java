/* 5 
 * 5 4
 * 5 4 3
 * 5 4 3 2 
 * 5 4 3 2 1
 */

import java.util.*;
class pattern8
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        int i,j;
        for(i=5;i>=1;i--)
        {
            for(j=5;j>=i;j--)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}