import java.util.*;
class Selection_Sort
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        int i,j,small,pos,tmp;
        System.out.println("Enter n:");
        int n = sc.nextInt();
        int a[] = new int[n];
        
        System.out.println("Enter the array elements");
        for(i=0;i<n;i++)
        {
            a[i] = sc.nextInt();
        }
        
        System.out.println("The Original Array is: ");
        for(i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
        
        for(i=0;i<n-1;i++)
        {
            small = a[i];
            pos = i;
            for(j=i+1;j<n;j++)
            {
                if(a[j]<small)
                {
                    small = a[j];
                    pos = j;
                }
            }
            tmp = a[i];
            a[i] = a[pos];
            a[pos] = tmp;
        }
        
        System.out.println("\nThe Sorted Array is");
        for(i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}