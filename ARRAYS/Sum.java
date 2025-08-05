import java.util.*;
class Sum
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of te square matrix");
        int n=sc.nextInt();
        int a[][]=new int[n][n];
        System.out.println("Enter the array elements");
        int i,j,s=0;
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            a[i][j]=sc.nextInt();
        }
        System.out.println("The array is");
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            System.out.print(a[i][j]+"\t");
            System.out.println();
        }
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            s=s+a[i][j];
        }
        System.out.println("The sum of the array elemnts is "+s);
    }
}