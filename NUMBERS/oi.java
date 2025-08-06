import java.util.*;
class oi
{
    public static void main(String agrs[])
    {
        Scanner sc=new Scanner(System.in);
        double s=0.0,i,f=1;
        for (i=2;i<=10;i=i+2)
        {
            f=i*f*(i-1);
            s=s+(1/f);
        }
        System.out.println(s);
        
    }
}
        