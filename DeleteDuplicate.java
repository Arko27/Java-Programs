import java.util.*;
class DeleteDuplicate
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the first array");
        int p=sc.nextInt();
        int a[]=new int[p];
        System.out.println("Enter the size of the second array");
        int q=sc.nextInt();
        int b[]=new int[q];
        int size=p+q;
        int c[]=new int[size];
        int i,j,x;
        System.out.println("The elements of the first array is");
        for(i=0;i<p;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("The elements of the second array is");
        for(i=0;i<q;i++)
        {
            b[i]=sc.nextInt();
        }
        for(i=0;i<p;i++)
        {
            c[i]=a[i];
        }
        x=p;
        for(i=0;i<q;i++)
        {
            c[x]=b[i];
            x++;
        }
        for(i=0;i<size;i++)
        {
            for(j=i+1;j<size;j++)
            {
                if(c[i]==c[j])
                {
                    while(j<(size-1))
                    {
                        c[j]=c[j+1];
                        j++;
                    }
                    size--;
                }
            }
        }
        System.out.println("The new array by deleting the duplicate elements is");
        for(i=0;i<size;i++)
        {
            System.out.println(c[i]);
        }
    }
}