import java.util.*;
class adam_number
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER A NUMBER: ");
        int n=sc.nextInt();
        int v,s=0,a,x,j,m=0,z,k;
        v=n;
        while(n>0)
        {
            a=n%10;
            s=s*10+a;
            n=n/10;
        }
        j=(int)Math.pow(v,2);
        x=(int)Math.pow(s,2);
        while(j>0)
        { 
            z=j%10;
            m=m*10+z;
            j=j/10;
        } 
        if(m==x)
        System.out.println("ADAM NUMBER");
        else
        System.out.println("NOT ADAM NUMBER");
    }
}