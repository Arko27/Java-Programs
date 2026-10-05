import java.util.*;

class Taxi_Number {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no.");
        int n = sc.nextInt();
        int i, j, p = 0;
        for (i = 1; i < n; i++) {
            for (j = 1; j < i; j++) {
                if ((Math.pow(i, 3)) + (Math.pow(j, 3)) == n) {
                    System.out.println("i= " + i + " and j= " + j);
                    p++;
                }
            }
        }
        if (p == 2)
            System.out.println(n + " is a Taxi Number");
        else
            System.out.println(n + " is not a Taxi Number");
    }
}