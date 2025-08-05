import java.util.*;
class sumSeries2
{
    void main()
    {
        Scanner sc = new Scanner(System.in);
        
        int n,a,i;
        double s = 0.0;
        System.out.println("S = a + a^2/2 + a^3/3 + ............ to a^n/n terms");
        System.out.println("Enter the value of a");
        a = sc.nextInt();
        System.out.println("Enter the value of n");
        n = sc.nextInt();
        
        for(i=1;i<=n;i++)
        {
            s = s + Math.pow(a,i)/i;
        }
        System.out.println("The Sum of the Series is: " + s);
    }
}