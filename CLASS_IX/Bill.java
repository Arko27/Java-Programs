import java.util.*;
class Bill
{
void main()
{
    Scanner sc=new Scanner(System.in);
    String a;
    double u,b=0;
    System.out.println("Enter the customer id");
    a=sc.nextLine();
    System.out.println("Enter the units");
    u=sc.nextDouble();
    if(u<=200)
    b=u*3.80;
    else if(u>200&&u<=300)
    b=200*3.80+(u-200)*4.40;
    else if(u>300 && u<=400)
    b=200*3.80+100*4.40+(u-300)*5.10;
    else if(u>400)
    b=200*3.80+100*4.50+100*5.10+(u-400)*5.80;
    System.out.println("name="+a);
    System.out.println("bill="+b);
}
}
    
    