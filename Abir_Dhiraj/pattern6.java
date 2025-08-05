/* 5 5 5 5 5 
 * 4 4 4 4 
 *3 3 3
 * 2 2
 * 1
 */ 

import java.util.*;
class pattern6
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        int i,j;
        for(i=5;i>=1;i--)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}