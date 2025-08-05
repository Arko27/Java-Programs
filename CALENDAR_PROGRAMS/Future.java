import java.util.*;
class Future
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        int month[]={0,31,28,31,30,31,30,31,31,30,31,30,31};
        String mna[]={"","JANUARY","FEBRUARY","MARCH","APRIL","MAY","JUNE","JULY","AUGUST","SEPTEMBER","OCTOBER","NOVEMBER","DECEMBER"};
        System.out.println("Enter the Year:");
        int y=sc.nextInt();
        System.out.println("Enter the Day No.:");
        int day = sc.nextInt();
        int count=1;
        int d=1;
        int m=1;
        if((y%400==0) || ((y%100!=0)&&(y%4==0)))
            month[2]=29;
        if(y<1700 && y>2700)
            System.out.println("Invalid");
        else
        {
            while(count<day)
            {
                d++;
                count++;
                if(d>month[m])
                {
                    d=1;
                    m++;
                }
                if(m>12)
                {
                    m=1;
                    y++;
                    if((y%400==0) || ((y%100!=0)&&(y%4==0)))
                    month[2]=29;
                    else
                    month[2]=28;
                }
            }
            System.out.println("Future Date:"+mna[m] + " " + d + ", " + y);
        }
    }
}