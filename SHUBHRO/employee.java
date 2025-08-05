import java.util.*;
public class employee
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter the values ");
        double da , pf , hra , bp;
        double gp,np;
        bp = sc.nextInt();
        da = 30.0*bp/100.0;
        pf=12.5*bp/100.0;
        hra= 15.0*bp/100.0;
        gp = bp + da + hra ;
        np = gp - pf;
        System.out.println(" dearness allowance is " +da);
    
        System.out.println(" provident fund is " +pf);
        
        System.out.println( " house rent allowance is" +hra);
        
        System.out.println(" gross pay is " +gp);
        System.out.println( " net pay is " +np);
    }
}
        