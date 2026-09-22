import java.util.Scanner;

class Triangle_Check {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("1. Check Triangle on the basis of sides");
        System.out.println("2. Check Triangle on the basis of angles");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Enter the sides of the triangle");
                double a = sc.nextDouble();
                double b = sc.nextDouble();
                double c = sc.nextDouble();
                if (a + b > c && b + c > a && c + a > b) {
                    if (a == b && b == c && c == a)
                        System.out.println("It is an Equilateral Triangle");
                    else if (a == b || b == c || c == a)
                        System.out.println("It is an Isosceles Triangle");
                    else
                        System.out.println("It is an Scalene Triangle");
                } else
                    System.out.println("Tringle is not Possible");
                break;

            case 2:
                System.out.println("Enter the angles of the triangle");
                double x = sc.nextDouble();
                double y = sc.nextDouble();
                double z = sc.nextDouble();
                if (x + y + z == 180) {
                    if (x < 90 && y < 90 && z < 90)
                        System.out.println("It is an Acute-angled Triangle");
                    else if (x == 90 || y == 90 || z == 90)
                        System.out.println("It is a Right-angled Triangle");
                    else if (x > 90 || y > 90 || z > 90)
                        System.out.println("It is an Obtuse-angled Triangle");
                } else
                    System.out.println("Tringle is not Possible");

            default:
                System.out.println("Wrong Choice");
                break;
        }
    }
}