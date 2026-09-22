import java.util.*;

class Calculate_Bill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double bill = 0.0;
        System.out.println("Enter the Customer Name");
        String name = sc.nextLine();
        System.out.println("Enter the units");
        double units = sc.nextDouble();

        if (units <= 200)
            bill = units * 3.80;
        else if (units > 200 && units <= 300)
            bill = 200 * 3.80 + (units - 200) * 4.40;
        else if (units > 300 && units <= 400)
            bill = 200 * 3.80 + 100 * 4.40 + (units - 300) * 5.10;
        else if (units > 400)
            bill = 200 * 3.80 + 100 * 4.50 + 100 * 5.10 + (units - 400) * 5.80;

        System.out.println("Name: " + name);
        System.out.println("Bill: " + bill);
    }
}