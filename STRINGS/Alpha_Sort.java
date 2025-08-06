import java.util.*;

public class Alpha_Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = sc.nextLine();
        str.trim();
        str += ' ';
        int i, j, wrd;
        String tmp;
        String arr[] = str.split(" ");
        wrd = arr.length;

        System.out.println("\nLength of the Sentence is: " + wrd);

        for (i = 0; i < wrd - 1; i++) {
            for (j = 0; j < wrd - 1 - i; j++) {
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }

        System.out.println("\nThe Rearranged Sentence is:");
        for (i = 0; i < wrd; i++)
            System.out.print(arr[i] + " ");
    }
}