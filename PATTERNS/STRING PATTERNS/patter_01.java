/*
 * A
 * A B
 * A B C
 * A B C D
 * A B C D E
 */
import java.util.*;
class patter_01
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        int a=65,n;
        int i,f;
        System.out.println("Enter the no. of rows");
        n = sc.nextInt();
        for(i=0;i<n;i++)
        {
            for(f=65;f<=65+i;f++)
                System.out.print((char)f+" ");
            System.out.println();
        }
    }
}