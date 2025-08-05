import java.util.*;
class Bubble_Sort
{
    void main()
    {
        Scanner sc = new Scanner (System.in);
        int i,j,tmp;
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int a[] = new int[n];
        for(i=0;i<n;i++)
        {
            a[i] = sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            for(j=0;j<n-1;j++)
            {
                if(a[j] > a[j+1])
                {
                    tmp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = tmp;
                }
            }
        }
        System.out.println("The Sorted Array is:\n");
        for(i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}