import java.util.*;
class a
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n");
        int n=sc.nextInt();
        int a[]=new int[n];
        int i,es=0,os=0;
        System.out.println("Enter the elements");
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            if(a[i]%2==0)
            es=es+a[i]*a[i];
            else
            os=os+a[i]*a[i];
        }
        System.out.println(os+" "+es);
    }
}