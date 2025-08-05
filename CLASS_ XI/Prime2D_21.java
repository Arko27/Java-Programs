import java.util.*;
class Prime2D_21
{
    int prime(int n)
    {
        int i,c=0;
        for(i=1;i<=n;i++)
        {
            if(n%i==0)
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
        int i,j,k=0,n,s;
        System.out.println("Enter the value of n");
        n=sc.nextInt();
        int no[]=new int[n];
        System.out.println("Enter the numbers: ");
        for(i=0;i<n;i++)
        {
            no[i]=sc.nextInt();
        }
        s=(int)Math.ceil(Math.sqrt(n));
        int a[][]=new int[s][s];
        for(i=0;i<s;i++)
        {
            for(j=0;j<s;j++)
            {
                if(k<n && prime(no[k])==1)
                a[i][j]=no[k];
                else
                a[i][j]=0;
                k++;
            }
        }
        for(i=0;i<s;i++)
        {
            for(j=0;j<s;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}