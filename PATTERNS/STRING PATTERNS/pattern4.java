import java.util.*;
class pattern4
{
    void main()
    {
        Scanner sc=new Scanner (System.in);
        int i,j,a=0,b=1;
        for(i=1;i<=5;i++)
        {
            for(j=1;j<=i;j++)
            {
                if(j%2==0)
                    System.out.print(a);
                else
                    System.out.print(b);
            }
            System.out.println();
            }
        }
    }