import java.util.*;
class Binary_Search
{
    void main()
    {
        Scanner sc = new Scanner (System.in);
        int i,srch,f=0;
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int a[] = new int[n];
        int l=0,u=n-1,mid;
        for(i=0;i<n;i++)
        {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter the value to be searched");
        srch = sc.nextInt();
        while(l<=u)
        {
            mid = (l+u)/2;
            if(srch > a[mid])
            l = mid+1;
            else if(srch < a[mid])
            u = mid-1;
            else
            {
                f=1;
                break;
            }
        }
        if(f == 1)
        System.out.println("Search Successful");
        else
        System.out.println("Search Unsuccessful");
    }
}