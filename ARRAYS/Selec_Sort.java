import java.util.*;
class Selec_Sort
{
    void main()
    {
        Scanner sc = new Scanner (System.in);
        int i,j,pos,sort,tmp;
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int a[] = new int[n];
        for(i=0;i<n;i++)
        {
            a[i] = sc.nextInt();
        }
        for(i=0;i<n-1;i++)
        {
            sort = a[i];
            pos = i;
            for(j=i+1;j<n;j++)
            {
                if(a[j] > sort)
                {
                    sort = a[j];
                    pos = j;
                }
            }
            tmp = a[i];
            a[i] = a[pos];
            a[pos] = tmp;
        }
        System.out.println("The sorted Array is:\n");
        for(i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}