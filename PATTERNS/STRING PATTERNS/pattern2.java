import java.util.*;
class pattern2
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        int i,j,k;
        for(i=5;i>=1;i--)
        {
            for(k=5;k<=1-i;k++)
            {
                System.out.print(" ");
            }
            for(j=i;j>=1;j--)
            System.out.print(i+" ");
            System.out.println();
        }
    }
}
        
        