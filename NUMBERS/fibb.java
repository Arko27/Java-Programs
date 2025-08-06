import java.util.*;
class fibb
{
    public static void main(String args[])
    {
        int a,b,c,n,i;
        a=0;b=1;c=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrn n");
        n = sc.nextInt();
        System.out.println("THE FIBONACCI SERIES IS");
        System.out.println(a);
        System.out.println(b);
        for(i=3;i<=n;i++)
        {
              c=a+b;
              System.out.println(c);
              a=b;
              b=c;
        }        
    }
}