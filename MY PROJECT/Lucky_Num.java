import java.util.*;
class Lucky_Num
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int n=sc.nextInt();
        int a[]=new int[n];
        int c=n;
        int i,j;
        for(i=0;i<n;i++)
        {
            a[i]=i+1;
        }
        int del=1;
        System.out.println("\nLucky Number operation :\n");
        while(del<n)
        {
            for(i=del;i<n;i+=del)
            {
                for(j=i;j<n-1;j++)
                {
                    a[j]=a[j+1];
                }
                n--;
            }
            del++;
            for(i=0;i<n;i++)
            {
                System.out.print(a[i]+" ");
            }
                System.out.println();
            }
        System.out.print("\nHence, the Lucky Numbers less than "+c+" are :");
        for(i=0;i<n;i++)
        {
        System.out.print(a[i]+" ");
        }
    }
}