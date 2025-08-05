/*
 * A B C D E
 * A B C D
 * A B C
 * A B
 * A
 */
import java.util.*;
class pattern3
{
    void main()
    {
        Scanner sc= new Scanner(System.in);
        int n,i,j;
        System.out.println("enter the no of rows");
        n=sc.nextInt();
        for(i=n;i>=1;i--)
        {
            for(j=65;j<=65+i-1;j++)
            System.out.print((char)j+" ");
            System.out.println();
        }
    }
}