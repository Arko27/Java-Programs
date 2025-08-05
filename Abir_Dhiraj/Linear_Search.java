import java.util.*;
class Linear_Search
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,j,f=0,n,n1;
        
        System.out.println("Enter n:");
        n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the Array Elements");
        
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        
        System.out.println("Enter the no. to be searched:");
        n1=sc.nextInt();        
        
        for(i=0;i<n;i++)
        {
            if(a[i] == n1)
            {
                f=1;
                break;
            }
        }
        
        if(f==1)
        System.out.println("The no. is present in positon "+(i+1));
        else
        System.out.println("The no is not present");
    }
}