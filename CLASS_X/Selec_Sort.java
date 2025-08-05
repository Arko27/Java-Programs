import java.util.*;
class Selec_Sort
{
    void main()
    {
        Scanner sc = new Scanner (System.in);
        int i,j,small,pos,tmp;
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int a[] = new int[n];
        
        System.out.println("Enter the array elements");
        for(i=0;i<n;i++)
        {
            a[i] = sc.nextInt();
        }
        
        System.out.println("The array elements are");
        for(i=0;i<n;i++)
        {
            System.out.println(a[i]+" ");
        }
        
        for(i=0;i<n-1;i++)
        {
            small = a[i];
            pos = i;
            for(j=i+1;j<n;i++)
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
        
        System.out.println("The Sorted Array is");
        for(i=0;i<n;i++)
        {
            System.out.println(a[i]+" ");
        }
    }
}