import java.util.*;
class Keith_No
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a number: ");
        int n = sc.nextInt();
        int d = 0, rem, i, j, sum, n1 = n, n2 = n;
        int arr[]=new int[n];
        
        while(n2 > 0)
        {
            rem = n2 % 10;
            d++;
            n2 = n2 / 10;
        }
        for(i=d-1; i>=0; i--)
        {
            arr[i]=n1 % 10;
            n1=n1/10;
        }
      
        i=d; sum=0;
        while(sum<n)
        {
            sum = 0;
            for(j=1; j<=d; j++)
            {
                sum=sum+arr[i-j];
            }
            arr[i]=sum;
            i++;
        }
        
        if(sum==n)
            System.out.println("Keith Number");
        else
            System.out.println("Not a Keith Number");
    }
}