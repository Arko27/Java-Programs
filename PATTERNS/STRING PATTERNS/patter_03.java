/*
 * A
 * A B
 * A B C
 * A B C D
 * A B C D E
 */
import java.util.*;
class patter_03
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        int a=65,n;
        int i,f;
        System.out.println("Enter the no. of rows");
        n = sc.nextInt();
        for(i=n-1;i>=0;i--)
        {
            for(f=65+i;f>=65;f--)
                System.out.print((char)f+" ");
            System.out.println();
        }
    }
}