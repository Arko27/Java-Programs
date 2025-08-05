import java.util.*;
class IDtoIID
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n=sc.nextInt();        
        int a[]=new int[n];        
        int k=0,i,j,p=0;
        System.out.println("Enter the elemnts in ID Array");
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("The ID Array is");
        for(i=0;i<n;i++)
        {
            System.out.print(a[i]+"\t");
        }
        System.out.println();
        p=(int)Math.sqrt(n);
        int b[][]=new int [p][p];
        for(i=0;i<p;i++)
        {
            for(j=0;j<p;j++)
            {
                b[i][j]=a[k];
                k++;
            }
        }
        System.out.println("The conversion from ID to IID Array is---->");
        for(i=0;i<p;i++)
        {
            for(j=0;j<p;j++)
            {
                System.out.print(b[i][j]+"\t");
            }
            System.out.println();
        }
    }
}