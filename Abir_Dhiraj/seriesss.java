import java.util.*;
class seriesss
{
    public static void main(String args)
    {
        Scanner sc=new Scanner(System.in);
        int a,i;
        double d;
        System.out.println("Enter any number");
        a=sc.nextInt();
        for(i=2;i<=10;i=i+2)
        {
            d=(a/Math.sqrt(i));
            System.out.println(d);
        }
    }
}


