import java.util.*;
class Prime_Matrix
{
    int prime(int n)
    {
        int c=0,i;
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
        System.out.println("Enter the no. of rows of the array");
        int m=sc.nextInt();
        System.out.println("Enter the no. of columns of the array");
        int n=sc.nextInt();
        int a[][]=new int[m][n];
        int b[]=new int[m*n];
        int i=0,j=2,p=0,i1;
        while(p<(m*n))
        {
            if(prime(j)==1)
            {
                b[i]=j;
                p++;
            }
            j++;
            i++;
        }
        for(i1=0;i1<m*n;i1++)
        System.out.println(b[i1]);
    }
}