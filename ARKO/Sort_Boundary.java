import java.util.*;
class Sort_Boundary
{
    int t,r,c,i,j,n,m,s=0;
    int a[][],b[];
    void show()
    {
        t=1;
        c=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int n=sc.nextInt();
        System.out.println("Enter the number of columns");
        int m=sc.nextInt();
        a=new int[n][m];
        b=new int[2*(m+n)];
        System.out.println("Enter the array elements");
        for(i=0;i<n;i++)
        {
            for(j=0;j<m;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("The array is");
        for(i=0;i<n;i++)
        {
            for(j=0;j<m;j++)
            {
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println("\n");
        for(i=0;i<m;i++)
        {
            b[c++]=a[0][i];
        }
        for(i=1;i<n;i++)
        {
            b[c++]=a[i][m-1];
        }
        for(i=m-2;i>=0;i--)
        {
            b[c++]=a[n-1][i];
        }
        for(i=n-2;i>0;i--)
        {
            b[c++]=a[i][0];
        }
        bsort();
        r=0;
        c=-1;
        t=0;
        for(i=1;i<=m;i++)
        {
            a[r][++c]=b[t++];
        }
        for(i=1;i<=n-1;i++)
        {
            a[++r][c]=b[t++];
        }
        for(i=1;i<=m-1;i++)
        {
            a[r][--c]=b[t++];
        }
        for(i=1;i<=n-2;i++)
        {
            a[--r][c]=b[t++];
        }
        System.out.println("After sorting the boundary values");
        for(i=0;i<n;i++)
        {
            for(j=0;j<m;j++)
            {
                System.out.print(" "+a[i][j]+"\t");
            }
            System.out.println();
        }
        
        for(i=0;i<n;i++)
        {
            for(j=0;j<m;j++)
                if(i == 0 || j == 0 || i == n-1 || j == m-1)
                    s = s + a[i][j];
        }
        System.out.println("The sum of the boundary elements is: "+s);
    }
    private void bsort()
    {
        int flag;
        for(i=0;i<c;i++)
        {
            flag=0;
            for(j=0;j<c-i-1;j++)
            {
                if(b[j]>b[j+1])
                {
                    flag=1;
                    t=b[j];
                    b[j]=b[j+1];
                    b[j+1]=t;
                }
            }
            if(flag==0)
            break;
        }
    }
    public static void main(String args[])
    {
        Sort_Boundary ob=new Sort_Boundary();
        ob.show();
    }
}