import java.util.*;
class series1
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        int i,sign=1;
        for(i=2;i<=20;i++)
        {
            i*=sign;
            System.out.print(i+" ");
            sign*=-1;
        }
    }
}