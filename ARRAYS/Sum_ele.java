import java.util.*;
class Sum_ele
{
    void main()
    {
        Scanner sc = new Scanner(System.in);
        int r,c;
        System.out.println("Enter the no. of rows");
        r=sc.nextInt();
        System.out.println("Enter the no. of columns");
        c=sc.nextInt();
        int a[][]=new int[r][c];
        int i,j,s=0;
        System.out.println("Enter the array elements");
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                a[i][j] = sc.nextInt();
            }
        }
        
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                s=s+a[i][j];
            }
        }
        System.out.println("The sum of the elements is: "+s);
    }
}