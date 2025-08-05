import java.util.*;
class pair
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        int p=0,i,j,q=0;
        System.out.println("Enter the no. of stocks");
        int n=sc.nextInt();
        int c[]=new int[n];
        System.out.println("Enter the colour of the stocks");
        for(i=0;i<n;i++)
        {
            c[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            for(j=0;j<i;j++)
            {
                if(c[i]==c[j])
                p++;
            }
            q=q+(p/2);
            p=0;
        }
        System.out.println("No. of pair of stocks of same colour "+q);
    }
}