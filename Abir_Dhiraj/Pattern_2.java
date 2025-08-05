import java.util.*;
class Pattern_2
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        int i,j;
        for(i=1;i<=5;i++)
        {
            for(j=1;j<=i;j++)
            {
                if(j%2==0)
                System.out.print("0"+" ");
                else
                System.out.print("1"+" ");
            }
            System.out.println();
        }
    }
}