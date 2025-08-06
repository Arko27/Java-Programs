import java.util.*;
class pattern5
{
    void main ()
    {
        Scanner sc=new Scanner (System.in);
        int i,j,k;   
        for(i=1;i<=5;i++)
        {
            for(k=1;k<=5-i;k++)
            System.out.print(" ");
            for(j=1;j<=i;j++)
            System.out.print(j+" ");
            System.out.println();
        }
    }
}

