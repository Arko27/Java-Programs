import java.util.*;
class Unique
{
    int unique(String n)
    {
        int i,j,f=0;
        int len=n.length();
        for(i=0;i<len-1;i++)
        {
            for(j=i+1;j<len;j++)
            if(n.charAt(i)==n.charAt(j))
            {
                f=1;
                break;
            }
        }
        if(f==0)
        return 1;
        else
        return 0;
    }
    void main()
    {
        Scanner sc=new Scanner(System.in);
        int n,i;
        System.out.println("Enter the value of n");
        n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the Array elements");
        for(i=0;i<n;i++)
            a[i]=sc.nextInt();
        
        System.out.println("The Unique Numbers are");
        for(i=0;i<n;i++)
        {
            if(unique(Integer.toString(a[i]))==1)
            System.out.println(a[i]);
        }
    }
}