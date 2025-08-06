import java.util.*;

public class Box_Problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of Boxes");
        int n = sc.nextInt();
        int cart[] = { 48, 24, 12, 6 };
        int No_Cart = 0, To_Cart = 0, i, t;
        if (n < 1 || n > 1000)
            System.out.println("INVALID INPUT");
        else {
            t = n;
            for (i = 0; i < 4; i++) {
                No_Cart = t / cart[i];
                System.out.println(cart[i] + "*" + No_Cart + "=" + (No_Cart * cart[i]));
                To_Cart = To_Cart + No_Cart;
                if (t % cart[i] != 0)
                    t = t % cart[i];
            }
            if ((t < 6) && (t != 0))
                To_Cart = To_Cart + 1;
            System.out.println("Total no. of boxes= " + n);
            System.out.println("Remaining Boxes= " + t);
            System.out.println("Total no. of cartoons= " + To_Cart);
        }
    }
}