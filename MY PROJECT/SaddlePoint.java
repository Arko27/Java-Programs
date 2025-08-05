import java.util.*;
class SaddlePoint
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=sc.nextInt();
        int a[][]=new int[n][n];
        int i,j,max,k,min,x,f=0;
        System.out.println("Enter the elements in the matrix");
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("The original Matrix is");
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
            min=a[i][0];
            x=0;
            for(j=0;j<n;j++)
            {
                if(a[i][j]<min)
                {
                    min=a[i][j];
                    x=j;
                }
            }
            max=a[0][x];
            for(k=0;k<n;k++)
            {
                if(a[k][x]>max)
                {
                    max=a[k][x];
                }
            }
            if(max==min)
            {
                System.out.println("The SADDLE POINT is "+max);
                f=1;
            }
        }
        if(f==0)
        System.out.println("NO SADDLE POINT");
    }
}