import java.util.*;
class Linear_Search
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        int i,j;
        System.out.println("Enter the no. of elements");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the array elements");
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Enter the searched no.");
        int n1=sc.nextInt();
        int f=0;
        for(i=0;i<n;i++)
        {
            if(a[i]==n1)
            f=1;
            break;
        }
        if(f==1)
        System.out.println("the no. is present in"+(i+1)+"positon");
        else
        System.out.println("the no is not present");
    }
}