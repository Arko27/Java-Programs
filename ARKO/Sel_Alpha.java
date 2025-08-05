import java.util.*;
class Sel_Alpha
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=sc.nextInt();
        String a[]=new String[n];
        int i,j,pos;
        String tmp="",small="";
        System.out.println("Enter the array elements");
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextLine();
        }
        for(i=0;i<n-1;i++)
        {
            small=a[i];
            pos=i;
            for(j=i+1;j<n;j++)
            {
                if(small.compareTo(a[j])>0)
                {
                    small=a[j];
                    pos=j;
                }
            }
            tmp=a[i];
            a[i]=a[pos];
            a[pos]=tmp;
        }
        System.out.println("The sorted array is");
        for(i=0;i<n;i++)
        {
            System.out.println(a[i]);
        }
    }
}