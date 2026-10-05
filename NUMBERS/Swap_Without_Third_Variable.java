import java.util.*;

class Swap_Without_Third_Variable {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("Changed value of a = " + a);
        System.out.println("Changed value of b = " + b);
    }
}