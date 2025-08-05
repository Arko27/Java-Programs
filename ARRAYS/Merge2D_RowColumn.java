import java.util.*;
public class Merge2D_RowColumn
{
    public static void mergeRowWise(int a[][], int b[][], int r, int c)
    {
        int i, j;
        int RowWiseMerge[][] = new int[2 * r][c];

        for (i = 0; i < r; i++)
        {
            for (j = 0; j < c; j++)
            {
                RowWiseMerge[i][j] = a[i][j];
            }
        }

        for (i = 0; i < r; i++)
        {
            for (j = 0; j < c; j++)
            {
                RowWiseMerge[r + i][j] = b[i][j];
            }
        }

        System.out.println("The Row-Wise Merged matrix is: ");
        for (i = 0; i < 2 * r; i++)
        {
            for (j = 0; j < c; j++)
            {
                System.out.print(RowWiseMerge[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void mergeColumnWise(int a[][], int b[][], int r, int c)
    {
        int i, j;
        int ColumnWiseMerge[][] = new int[r][2 * c];
        for (i = 0; i < r; i++)
        {
            for (j = 0; j < c; j++)
            {
                ColumnWiseMerge[i][j] = a[i][j];
            }
        }

        for (i = 0; i < r; i++)
        {
            for (j = 0; j < c; j++)
            {
                ColumnWiseMerge[i][c + j] = b[i][j];
            }
        }

        System.out.println("The Column-Wise Merged matrix is: ");
        for (i = 0; i < r; i++)
        {
            for (j = 0; j < 2 * c; j++)
            {
                System.out.print(ColumnWiseMerge[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the matrices");
        int r = sc.nextInt();
        int c = sc.nextInt();

        int i, j, k;
        System.out.println("Enter the first matrix");
        int a[][] = new int[r][c];
        for (i = 0; i < r; i++)
        {
            for (j = 0; j < c; j++)
            {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter the second matrix");
        int b[][] = new int[r][c];
        for (i = 0; i < r; i++)
        {
            for (j = 0; j < c; j++)
            {
                b[i][j] = sc.nextInt();
            }
        }

        System.out.println("The first matrix is: ");
        for (i = 0; i < r; i++)
        {
            for (j = 0; j < c; j++)
            {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("The second matrix is: ");
        for (i = 0; i < r; i++)
        {
            for (j = 0; j < c; j++)
            {
                System.out.print(b[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("1. Row-Wise Merge");
        System.out.println("2. Column-Wise Merge");
        System.out.println("Enter Your Choice");
        int ch = sc.nextInt();

        switch (ch) {
            case 1:
                mergeRowWise(a, b, r, c);
                break;

            case 2:
                mergeColumnWise(a, b, r, c);
                break;

            default:
                System.out.println("Wrong Choice");
        }
    }
}