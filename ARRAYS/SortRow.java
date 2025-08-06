import java.util.*;
class SortRow
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=sc.nextInt();
        int a[][]=new int[n][n];
        int i,j,k,l,tmp;
        System.out.println("Enter the array elements");
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("The array is--->");
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                for(k=0;k<n-1;k++)
                {
                    for(l=0;l<n-1-k;l++)
                    {
                        if(a[i][l]>a[i][l+1])
                        {
                            tmp=a[i][l];
                            a[i][l]=a[i][l+1];
                            a[i][l+1]=tmp;
                        }
                    }
                }
            }
        }
        System.out.println("The array with sorted row is--->");
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }
    }
}