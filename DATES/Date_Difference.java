import java.util.*;

public class Date_Difference {
    int month[] = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

    int isLeap(int y) {
        if ((y % 400 == 0) || ((y % 100 != 0) && (y % 4 == 0)))
            return 29;
        else
            return 28;
    }

    boolean dateValidate(int d, int m, int y) {
        month[2] = isLeap(y);
        if (m < 1 || m > 12 || d < 1 || d > month[m] || y < 1000 || y > 9999)
            return false;
        else
            return true;
    }

    int dayno(int d, int m, int y) {
        int dn = 0;
        month[2] = isLeap(y);
        for (int i = 1; i < m; i++) {
            dn = dn + month[i];
        }
        dn = dn + d;
        for (int i = 1000; i < y; i++) {
            if (isLeap(i) == 29)
                dn = dn + 366;
            else
                dn = dn + 365;
        }
        return dn;
    }

    public static void main(String[] args) {
        Date_Difference ob = new Date_Difference();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the 1st date in (dd/mm/yyyy) format: ");
        String date1 = sc.nextLine();
        int d1 = Integer.valueOf(date1.substring(0, 2));
        int m1 = Integer.valueOf(date1.substring(3, 5));
        int y1 = Integer.valueOf(date1.substring(6));

        System.out.print("Enter the 2nd date in (dd/mm/yyyy) format: ");
        String date2 = sc.nextLine();
        int d2 = Integer.valueOf(date2.substring(0, 2));
        int m2 = Integer.valueOf(date2.substring(3, 5));
        int y2 = Integer.valueOf(date2.substring(6));

        if (ob.dateValidate(d1, m1, y1) == true && ob.dateValidate(d2, m2, y2) == true) {
            int a = ob.dayno(d1, m1, y1);
            int b = ob.dayno(d2, m2, y2);
            System.out.print("Difference of the two dates= " + Math.abs(a - b) + " days");
        } else
            System.out.println("Invalid Date");
    }
}