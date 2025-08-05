import java.util.*;
class ShiftRow_Upward
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER M:");
        int m = sc.nextInt();
        System.out.println("ENTER N:");
        int n = sc.nextInt();
        int arr[][] = new int[m][n];
        int shift_Arr[][] = new int[m][n];
        int i, j, max, min, maxRow, maxCol, minRow, minCol;
        System.out.println("Enter elements in the matrix:");
        for (i = 0; i < m; i++)
        {
            for (j = 0; j < n; j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
        max = min = arr[0][0];
        maxRow = maxCol = minRow = minCol = -1;

        System.out.println("ORIGINAL MATRIX:");
        for (i = 0; i < m; i++) 
        {
            for (j = 0; j < n; j++) 
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        for (i = 0; i < m; i++)
        {
            for (j = 0; j < n; j++)
            {
                if (arr[i][j] > max)
                {
                    max = arr[i][j];
                    maxRow = i;
                    maxCol = j;
                }
                else if (arr[i][j] < min)
                {
                    min = arr[i][j];
                    minRow = i;
                    minCol = j;
                }
            }
        }
        System.out.println("LARGEST NUMBER: " + max + " (ROW = " + maxRow + "COLUMN = " + maxCol + " ");
        System.out.println("SMALLEST NUMBER: " + min + " (ROW = " + minRow + "COLUMN = " + minCol + " ");
    }
}