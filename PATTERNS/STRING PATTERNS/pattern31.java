import java.util.*;
class pattern3
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        int i,j,k;
        for(i=5;i>=1;i--)
        {
            for(k=0;k<=5-i;k++)
                System.out.print(" ");
            for(j=1;j<=i;j++)
                System.out.print(i);
                System.out.println();
        }
    }
}