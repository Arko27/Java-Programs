import java.util.*;

public class PhnNo_Search {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int i, f = 0, n;

        String name[] = new String[10];
        long phn[] = new long[10];

        System.out.println("Enter the Name and Telephone Numbers:");

        for (i = 0; i < 10; i++) {
            name[i] = sc.next();
            phn[i] = sc.nextLong();
        }

        System.out.println("Enter the Name to be searched:");
        String name1 = sc.next();

        for (i = 0; i < 10; i++) {
            if (name[i].equals(name1)) {
                f = i;
                break;
            }
        }

        if (f != 0)
            System.out.println("The Name is present and the Phone No. is " + phn[f]);
        else
            System.out.println("The Name is not present");
    }
}