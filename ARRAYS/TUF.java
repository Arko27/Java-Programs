public class TUF {
  public static void main(String[] args)
  {
      int arr_2d[][] = getArr();
      printArr(arr_2d);
  }

  private static int[][] getArr()
  {
      int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
      return arr;
  }

  private static void printArr(int[][] arr_2d)
  {
      for (int i = 0; i < arr_2d.length; i++)
      {
          for (int j = 0; j < arr_2d[0].length; j++)
          {
              System.out.print(arr_2d[i][j] + " ");
          }
      System.out.println();
      }
  }
}