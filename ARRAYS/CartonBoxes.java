import java.util.*;
public class CartonBoxes
{
    void main()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of boxes: ");
        int n = in.nextInt();
        
        if (n < 1 || n > 1000)
        {
            System.out.println("Invalid Input");
            return;
        }

        int Carton[] = {48, 24, 12, 6};
        int total = 0;
        int t = n;
        for (int i = 0; i < Carton.length; i++)
        {
            int cCount = t / Carton[i];
            t = t % Carton[i];
            total += cCount;
            if (cCount != 0)
            {
                System.out.println(Carton[i] + " * " + cCount + " = " + (Carton[i] * cCount));
            }
        }

        if (t != 0)
        {
            System.out.println("\nRemaining boxes = " +t+ " * 1 = "+t);
            total++;
        }
        else
            System.out.println("\nRemaining boxes = 0");
        
        System.out.println("Total number of boxes = " + n);
        System.out.println("Total number of cartons = " + total);
    }
}