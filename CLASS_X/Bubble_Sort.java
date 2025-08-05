import java.util.*;
class Bubble_Sort
{
    void main()
    {
        Scanner sc=new Scanner (System.in);
        int i,j,tmp;
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int a[] = new int[n];
        
        System.out.println("Enter the array elements");
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        
        System.out.println("The array elements are");
        for(i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
        
        for(i=0;i<n;i++)
        {
            for(j=0;j<n-i-1;j++)
            {
                if(a[j] > a[j+1])
                {
                    tmp  =a[j];
                    a[j] = a[j+1];
                    a[j+1] = tmp;
                }
            }
        }
        
        System.out.println("\nThe Sorted Array is");
        for(i=0;i<n;i++)
        {
            System.out.print(a[i]+ " ");
        }
    }
}  