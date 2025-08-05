import java.util.*;
class q7pg306
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int i,j;
        int ch ,r1,r2;
        double R1,R2;
        System.out.println("Press 1 for series 1 , press 2 for series 2");
        ch=sc.nextInt();
        System.out.println("Enter values of r1 and r2");
        r1=sc.nextInt();
        r2=sc.nextInt();
        switch (ch)
        {
            case 1:
            R1=r1+r2;
            System.out.println(R1);
            break;
            case 2:
            R2=(r1*r2)/(r1+r2);
            System.out.println(R2);
            break;
            default:
            System.out.println("Wrong choice");            
        }
    }
}
            
        