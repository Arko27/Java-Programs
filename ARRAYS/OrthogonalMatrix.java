import java.util.*;
class OrthogonalMatrix
{
    public static boolean isOrthogonal(int[][] matrix, int size)
    {
        if (matrix.length != size || matrix[0].length != size)
            return false;
        
        int[][] transposedMatrix = new int[size][size];
        for (int i = 0; i < size; i++)
        {
            for (int j = 0; j < size; j++)
                transposedMatrix[i][j] = matrix[j][i];
        }
        
        int[][] productMatrix = new int[size][size];
        for (int i = 0; i < size; i++)
        {
            for (int j = 0; j < size; j++)
            {
                int sum = 0;
                for (int k = 0; k < size; k++)
                    sum += matrix[i][k] * transposedMatrix[k][j];
                productMatrix[i][j] = sum;
            }
        }
        
        for (int i = 0; i < size; i++)
        {
            for (int j = 0; j < size; j++)
            {
                if (i == j && productMatrix[i][j] != 1)
                    return false;
                if (i != j && productMatrix[i][j] != 0)
                    return false;
            }
        }        
        return true;
    }
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the square matrix: ");
        int size = sc.nextInt();
        int[][] matrix = new int[size][size];
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < size; i++)
        {
            for (int j = 0; j < size; j++)
                matrix[i][j] = sc.nextInt();
        }        
        System.out.println("Original Matrix:");
        for (int i = 0; i < size; i++)
        {
            for (int j = 0; j < size; j++)
                System.out.print(matrix[i][j] + " ");
            System.out.println();
        }
        
        if (isOrthogonal(matrix, size))
            System.out.println("The matrix is orthogonal.");
        else
            System.out.println("The matrix is not orthogonal.");
    }
}
