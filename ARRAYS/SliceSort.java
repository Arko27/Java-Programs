import java.util.*;
public class SliceSort
{
    static void mergeArrays(int a[], int m, int b[], int n)
    {
        int mergedArray[] = new int[m + n];
        int i, k = 0;
        for (i = 0; i < m; i++)
            mergedArray[k++] = a[i];

        for (i = 0; i < n; i++)
            mergedArray[k++] = b[i];

        for (i = 0; i < k; i++)
            System.out.println(mergedArray[i]);
    }
    
    static void sortArray(int a[], int n)
    {
        int i,j,tmp;
        for(i=0;i<n-1;i++)
        {
            for(j=0;j<n-1-i;j++)
            {
                if(a[j]>a[j+1])
                {
                    tmp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=tmp;
                }
            }
        }
    }

    static int[] sliceArray(int arr[], int start, int end)
    {
        int slice[] = new int[end - start];

        int i, k = 0;
        for (i = start; i < end; i++)
            slice[k++] = arr[i];

        return slice;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array");
        int n = sc.nextInt();

        int i;
        int arr[] = new int[n];
        System.out.println("Enter the array elements: ");
        for (i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        int firstPart[] = sliceArray(arr, 0, n / 2);
        int secondPart[] = sliceArray(arr, n / 2, n);

        sortArray(firstPart, n/2);
        sortArray(secondPart, n - n/2);

        System.out.println("The Half-way Sorted array is: ");
        mergeArrays(firstPart, n / 2, secondPart, n - n / 2);
    }
}