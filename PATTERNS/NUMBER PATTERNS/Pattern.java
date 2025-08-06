import java.util.*;
class Pattern
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1. Pattern 1");
        System.out.println("Enter 2. Pattern 2");
        System.out.println("Enter Your Choice: ");
        int ch = sc.nextInt();

        switch(ch)
        {
            case 1:

                System.out.println("The First Pattern is: ");

                int i, j;            
                for (i = 0; i < 4; i++)
                {
                    for (j = 4 - i; j > 1; j--)
                        System.out.print("  ");
        
                    for (j = 0; j <= i; j++)
                        System.out.print("a   ");
        
                    System.out.println();
                }
        
                for (i = 2; i >= 0; i--)
                {
                    for (j = 4 - i; j > 1; j--)
                        System.out.print("  ");
        
                    for (j = i; j >= 0; j--)
                        System.out.print("a   ");
        
                    System.out.println();
                }
                break;
            
            case 2:

            System.out.println("The Second Pattern is: ");
                
                int k, l;

                for (i = 1; i <= 4; i++)
                {
                    for (j = 4; j > i; j--)
                        System.out.print("  ");
        
                    for (k = 1; k <= i; k++)
                        System.out.print(k+" ");
        
                    for (l = i - 1; l >= 1; l--)
                        System.out.print(l+" ");
                    
                    System.out.println();
                }
        
                for (i = 3; i >= 1; i--)
                {
                    for (j = 3; j >= i; j--)
                        System.out.print("  ");
        
                    for (k = 1; k <= i; k++)
                        System.out.print(k+" ");
        
                    for (l = i - 1; l >= 1; l--)
                        System.out.print(l+" ");
                    
                    System.out.println();
                }
                break;

            default:
                System.out.println("Wrong Choice");
        }
    }
}