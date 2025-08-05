import java.util.*;
class String_Patterns
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String s = sc.nextLine();
        System.out.println("Enter \n1. Pattern 1 \n2. Pattern 2");
        System.out.println("Enter Your Choice: ");
        int ch = sc.nextInt();
        int i;
        
        switch(ch)
        {
            case 1:
            
            for(i = s.length(); i >= 0; i--)
            {
                System.out.println(s.substring(0,i));
            }
            break;
            
            case 2:
            for(i = s.length(); i >= 0; i--)
            {
                System.out.println(s.substring(i));
            }
            break;
            
            default:
            System.out.println("Wrong Choice");
        }     
    }
}