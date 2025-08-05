import java.util.*;
class Keith_No
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int copy=n;
        int i,j,d,sum;
        String s=Integer.toString(n);
        d=s.length();
        int arr[]=new int[n];
        for(i=d-1;i>=0;i--)
        {
            arr[i]=copy%10;
            copy=copy/10;
        }
        i=d;
        sum=0;
        while(sum<n)
        {
            sum=0;
            for(j=1;j<=d;j++)
            {
                sum=sum+arr[i-j];
            }
            arr[i]=sum;
            i++;
        }
        if(sum==n)
        System.out.println(n+" is a Keith number");
        else
        System.out.println(n+" is not a Keith number");
    }
}