import java.util.*;
class nterms 
{  
    public static void main(String args[])
    { 
         Scanner sc = new Scanner (System.in);
         int n=10;
         nterms ob = new nterms();
         double s = ob.npow(n);         
         System.out.println(s);
    }

    public double npow(int n)
    {
        int i;
        double s = 0.0;
        for (i=1;i<=n;i++)
        {
            s=s+1/Math.pow(2,i);
        }
        
        return s;
    }
}