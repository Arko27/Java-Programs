import java.util.*;
class buzz
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,a,s=0;
        System.out.println("Enter a number");
        n=sc.nextInt();
        if(n%10==7 || n%7==0)
        System.out.println("BUZZ NUMBER");
        else
        System.out.println("NOT BUZZ NUMBER");
    }
}