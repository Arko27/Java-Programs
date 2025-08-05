import java.util.*;
class Merge_Array
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no. of elements in the First Array");
        int p=sc.nextInt();
        System.out.println("Enter the no. of elements in the Second Array");
        int q=sc.nextInt();
        int a[]=new int[p];
        int b[]=new int[q];
        int c[]=new int[p+q];
        int x=5,i,k,j;
        System.out.println("Enter the Elements in the First Array");
        for(i=0;i<p;i++)
        {
            a[i]=sc.nextInt();
        }
         System.out.println("Enter the Elements in the Second Array");
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
        int size=p+q;
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
        System.out.println("The Merged Array after deleting the Duplicate Elements is--->");
        for(k=0;k<size;k++)
        {
            System.out.println(c[k]);
        }
    }
}