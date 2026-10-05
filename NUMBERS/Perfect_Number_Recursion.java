import java.util.*;

class Perfect_Number_Recursion {
    int num;

    Perfect_Number_Recursion(int nn) {
        num = nn;
    }

    int sum_of_factors(int i) {
        int s = 0;
        if (i == num)
            return s;
        if (num % i == 0) {
            s = s + i;
            sum_of_factors(i + 1);
        }
        return s;
    }

    void check() {
        if (num == (sum_of_factors(num)))
            System.out.println(num + " is a Perfect Number");
        else
            System.out.println(num + " is not a Perfect Number");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no.");
        int n = sc.nextInt();
        Perfect_Number_Recursion obj = new Perfect_Number_Recursion(n);
        obj.sum_of_factors(n);
        obj.check();
    }
}