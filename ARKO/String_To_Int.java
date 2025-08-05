import java.util.*;
class String_To_Int
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a no.");
        String n=sc.nextLine();
        String p=n+(Integer.valueOf(n)*2)+(Integer.valueOf(n)*3);
        int q=Integer.valueOf(p)*10;
        System.out.println(q);
    }
}