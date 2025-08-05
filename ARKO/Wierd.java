import java.util.*;
class Wierd
{
    public static void main(int n)
    {
        Scanner sc = new Scanner(System.in);
        if(n%2!=0)
        System.out.println("Weird");
        else if((n%2==0) && ((n>=2) && (n<=5)))
        System.out.println("Not Weird");
        else if((n%2==0) && ((n>=6) && (n<=20)))
        System.out.println("Weird");
        else if((n%2==0) && (n>20))
        System.out.println("Not Weird");
    }
}