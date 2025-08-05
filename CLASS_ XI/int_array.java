/* a = 1 2
 *     3 4
 * 
 */

import java.util.*;
class int_array
{
    void main()
    {
        Scanner sc = new Scanner(System.in);
        int a[][]={{1,2},{3,4}};
        int i,j;
        for(i=0;i<2;i++)
        {
            for(j=0;j<2;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}