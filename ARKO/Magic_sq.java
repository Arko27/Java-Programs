import java.util.*;
class Magic_sq
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the Magic Square");
        int n=sc.nextInt();
        int r=n/2;
        int c=n-1;
        int m[][]=new int[n][n];
        int i=n/2; 
        int j=n-1;
        for (int num=1; num <= n*n; ) 
        { 
            if (i==-1 && j==n) 
            { 
                j=n-2; 
                i=0; 
            } 
            else
            { 
                if (j==n) 
                j=0; 
                if (i < 0) 
                i=n-1; 
            }
            if (m[i][j] != 0)  
            { 
                j-= 2; 
                i++; 
                continue; 
            } 
            else
            m[i][j]=num++;  
            j++;
            i--;  
        } 
        System.out.println("The Magic Square is:");
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.print(m[i][j]);
            }
            System.out.println();
        }
    }
}