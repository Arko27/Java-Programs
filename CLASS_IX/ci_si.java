import java.util.*;
class ci_si
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        double pri , ra , tme , ci , si , amnt;
        System.out.println(" enter the values ");
        pri = sc.nextDouble();
        ra = sc.nextDouble();
        tme = sc.nextDouble();
        
        si=(pri*ra*tme)/100.0;
        amnt=pri*Math.pow((1+ra/100.0),tme);
        ci=amnt-pri;
        ra=ci-si;
        System.out.println("Simple interest =" + si);
        System.out.println("Compound interest =" + ci);
        System.out.println("Difference between CI and SI=" + ra);
    }
}
    