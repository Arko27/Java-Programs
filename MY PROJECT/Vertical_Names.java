import java.util.*;
class Vertical_Names
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Value of N: ");
        int n = sc.nextInt();
        if (n <= 2 || n >= 5)
        {
            System.out.println("Invalid Input");
            return;
        }        
        String teams[] = new String[n];
        int highLen = 0;
        System.out.println("Enter the Names:");
        for (int i = 0; i < n; i++)
        {
             teams[i] = sc.next();
             if (teams[i].length() > highLen)
                 highLen = teams[i].length();
        }
        System.out.println("\nThe names in Vertical Order are:");
        for (int i = 0; i < highLen; i++)
        {
            for (int j = 0; j < n; j++)
            {
                int len = teams[j].length();
                if (i >= len)
                    System.out.print(" \t");
                else
                    System.out.print(teams[j].charAt(i) + "\t");
            }
            System.out.println();
        }
    }
}