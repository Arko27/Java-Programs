import java.util.*;
class Fill_Matrix
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER N:");
        int n = sc.nextInt();
        if (n > 3 && n < 10)
        {
            char arr[][] = new char[n][n];
            int i, j;
            System.out.println("Enter First Character: ");
            char char1 = sc.next().charAt(0);
            System.out.println("Enter Second Character: ");
            char char2 = sc.next().charAt(0);
            System.out.println("Enter Third Character: ");
            char char3 = sc.next().charAt(0);
            for (i = 0; i < n; i++)
            {
                for (j = 0; j < n; j++)
                {
                    if (i == 0 || j == 0 || i == n - 1 || j == n - 1)
                        arr[i][j] = char2;
                    if ((i == 0 && j == 0) || (i == 0 && j == n - 1) || (i == n - 1 && j == 0) || (i == n - 1 && j == n - 1))
                        arr[i][j] = char1;
                    if (i != 0 && j != 0 && i != n - 1 && j != n - 1)
                        arr[i][j] = char3;
                }
            }
            System.out.println("FORMED MATRIX:");
            for (i = 0; i < n; i++)
            {
                for (j = 0; j < n; j++)
                {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
        }
        else
            System.out.println("SIZE IS OUT OF RANGE");
    }
}