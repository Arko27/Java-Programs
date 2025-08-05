import java.io.*;
class SaddlePoint
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the size of the matrix");
        int n=Integer.parseInt(br.readLine());
        int A[][]=new int[n][n];
        int i,j;
        System.out.println("Enter the elements in the matrix");
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                A[i][j]=Integer.parseInt(br.readLine());
            }
        }
        System.out.println("The original Matrix is");
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.print(A[i][j]);
            }
            System.out.println();
        }
        int max,k,min,x,f=0;
        for(i=0;i<n;i++)
        {
            min=A[i][0];
            x=0;
            for(j=0;j<n;j++)
            {
                if(A[i][j]<min)
                {
                    min=A[i][j];
                    x=j;
                }
            }
            max=A[0][x];
            for(k=0;k<n;k++)
            {
                if(A[k][x]>max)
                {
                    max=A[k][x];
                }
            }
            if(max==min)
            {
                System.out.println("The Saddle point is "+max);
                f=1;
            }
        }
        if(f==0)
        System.out.println("No Saddle point");
    }
}