// WAP to input 3 nos and print the greatest among three using ternary.
import java.util.*;
class Greatest_3
{
    void main()
    {
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter the 1st no.");
        int a = sc.nextInt();
        System.out.println("Enter the 2nd no.");
        int b = sc.nextInt();
        System.out.println("Enter the 3rd no.");
        int c = sc.nextInt();
        int g = (a>b && a>c)?a:((b>a && b>c)?b:c);
        System.out.println("The Greatest among 3 nos. is "+g);
    }
}