import java.util.*;
class Prime_Matrix
{
    int prime(int n1)
    {
        int c=0,s;
        for(s=1;s<=n1;s++)                                           
        {
            if(n1%s==0)
            c++;
        }
        if(c==2)
        return 1;
        else 
        return 0;
    }
    void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no. of rows of the array");
        int m=sc.nextInt();
        System.out.println("Enter the no. of columns of the array");
        int n=sc.nextInt();
        int a[][]=new int[m][n];
        int b[]=new int[m*n];
        int j=1,p=0,i1,j1,k=0;;
        while(p<m*n)
        {
            if(prime(j)==1)
            {
                b[p]=j;
                p++;
            }
            j++;
        }
        for(i1=0;i1<m;i1++)
        {
            for(j1=0;j1<n;j1++)
            {
                a[i1][j1]=b[k];
                k++;
            }
        }
        System.out.println("The Prime Matrix is");
        for(i1=0;i1<m;i1++)
        {
            for(j1=0;j1<n;j1++)
            {
                System.out.print(a[i1][j1]+"\t");
            }
            System.out.println();
        }
    }
}