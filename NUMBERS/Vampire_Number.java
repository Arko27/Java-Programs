import java.util.*;

class Vampire_Number {
    public static int dig(int x1) {
        int s = 0, c;
        while (x1 > 0) {
            c = x1 % 10;
            s++;
            x1 = x1 / 10;
        }
        return s;
    }

    public static int composite(int x2) {
        int i, s1 = 0;
        for (i = 1; i < x2; i++) {
            if (x2 % i == 0)
                s1++;
        }
        if (s1 > 2)
            return 1;
        else
            return 0;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x, dummy, remainder, i = 0;
        boolean isvamp = false;
        int arr[] = new int[4];
        System.out.println("Enter a 4 digit no.");
        x = sc.nextInt();
        int p = dig(x);
        if ((p % 2 == 0) && (composite(x) == 1)) {
            dummy = x;
            while (dummy != 0) {
                remainder = dummy % 10;
                arr[i] = remainder;
                dummy = dummy / 10;
                i++;
            }
            for (int z = 0; z < 4; z++) {
                for (int j = 0; j < 4; j++) {
                    for (int k = 0; k < 4; k++) {
                        for (int l = 0; l < 4; l++) {
                            int fang = (arr[z] * 10 + arr[j]) * (arr[k] * 10 + arr[l]);
                            if (fang == x) {
                                isvamp = true;
                                break;
                            }
                        }
                    }
                }
            }
            if (isvamp)
                System.out.println(x + " is a Vampire Number");
            else
                System.out.println(x + "is not a Vampire Number");
        } else
            System.out.println("Invalid Input");
    }
}