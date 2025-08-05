import java.util.*;
class Binary_Search
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        int i,srch,f=0,l,u,mid=0;
        System.out.println("Enter n:");
        int n = sc.nextInt();
        int a[] = new int[n];
        l = 0;
        u = n-1;
        
        System.out.println("Enter the Array Elements(In Sorted Order):");
        for(i=0;i<n;i++)
        {
            a[i] = sc.nextInt();
        }
        
        System.out.println("Enter the no. to be searched:");
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
        System.out.println("The no. is present in positon "+(mid+1));
        else
        System.out.println("The no. is not present");
    }
}