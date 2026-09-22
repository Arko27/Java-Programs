import java.util.*;

class Simple_Compound_Interest {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        double SI, CI, amt, diff;
        System.out.println("Enter the Principal Amount ");
        double p = sc.nextDouble();
        System.out.println("Enter the rate of interest");
        double r = sc.nextDouble();
        System.out.println("Enter the time (in years)");
        double t = sc.nextDouble();

        SI = (p * r * t) / 100.0;
        amt = p * Math.pow((1 + r / 100.0), t);
        CI = amt - p;
        diff = CI - SI;
        
        System.out.println("Simple interest = " + SI);
        System.out.println("Compound interest = " + CI);
        System.out.println("Difference between CI and SI=" + diff);
    }
}