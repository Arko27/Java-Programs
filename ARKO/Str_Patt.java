import java.util.*;
class Str_Patt
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        String ar[];
        int n,i,j;
        System.out.println("Enter the no. of names");
        n=sc.nextInt();
        ar=new String[n+1];
        System.out.println("Enter the names");
        for(i=0;i<n+1;i++)
        {
            ar[i]=sc.nextLine();
        }
        int max=0;
        for(i=0;i<n+1;i++)
        {
            if(max<ar[i].length())
            max=ar[i].length();
        }
        System.out.println("The OUTPUT is:");
        for(i=0;i<max;i++)
        {
            for(j=0;j<n+1;j++)
            {
                if(i<ar[j].length())
                System.out.print(ar[j].charAt(i)+"\t");
                else
                System.out.print("\t");
            }
            System.out.println();
        }
    }
}