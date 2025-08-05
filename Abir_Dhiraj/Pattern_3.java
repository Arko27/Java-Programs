import java.util.*;
class Pattern_3
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        int i,j,c=15;
        for(i=5;i>=1;i--)
        {
            for(j=i;j>=1;j--)
            {
                System.out.print(c+" ");
                c--;
            }
            System.out.println();
        }
    }
}