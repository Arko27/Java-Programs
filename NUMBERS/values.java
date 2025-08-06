import java.util.*;
class values
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter any numbers");
        a=sc.nextInt();
        b=sc.nextInt();
        System.out.println("1.addition,2.substraction,3.multiplication,4.divion,5.remainder");
        System.out.println("Enter your choice");
        c=sc.nextInt();
        switch(c)
        {
            case 1:
            System.out.println("The sum is"+(a+b));
            break;
            case 2:
            System.out.println("The substruction is"+(a-b));
            break;
            case 3:
            System.out.println("The multiplication is"+a*b);
            break;
            case 4:
            System.out.println("The division is"+a/b);
            break;
            case 5:
            System.out.println("The remainder is"+a%b);
            break;
            default:
            System.out.println("Wrong choice");
        }
    }
}