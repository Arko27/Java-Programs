/* WAP to input n X n matrix and print its transpose 
 * 
 * Input:  a = [1 2 3
 *              4 5 6
 *              7 8 9]
 *              
 * Output: aT = [1 4 7
 *               2 5 8
 *               3 6 9]
 */

import java.util.*;
class Transpose
{
    void main()
    {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the value of n");
        n=sc.nextInt();
        int a[][]=new int[n][n];
        int i,j;
        System.out.println("Enter the array elements");
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                a[i][j] = sc.nextInt();
            }
        }
        
        System.out.println("The Original Matrix is:");
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }
        
        System.out.println("The Transposed Matrix is:");
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.print(a[j][i]+"\t");
            }
            System.out.println();
        }
    }
}