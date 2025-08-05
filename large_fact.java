import java.util.*;
import java.math.*;
class large_fact
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no.");
        int n=sc.nextInt();
        int i;
        BigInteger f=BigInteger.ONE;
        for(i=1;i<=n;i++)
        {
            f=f.multiply(new BigInteger(String.valueOf(i)));
        }
        System.out.println(f);
    }
}