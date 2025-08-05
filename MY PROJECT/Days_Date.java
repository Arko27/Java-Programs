import java.util.*;
class Days_Date
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int mnu[]={0,31,28,31,30,31,30,31,31,30,31,30,31};
        String mna[]={"JANUARY","FEBRUARY","MARCH","APRIL","MAY","JUNE","JULY","AUGUST","SEPTEMBER","OCTOBER","NOVEMBER","DECEMBER"};
        int i,d,m=1,count=0;
        String date="";
        System.out.println("ENTER THE DAY NUMBER:");
        int dn=sc.nextInt();
        System.out.println("ENTER THE YEAR:");
        int y=sc.nextInt();
        String y1=Integer.toString(y);
        System.out.println("ENTER THE VALUE OF N:");
        int N=sc.nextInt();
        if(dn<1 || dn>366)
        System.out.println("DAY NUMBER OUT OF RANGE");
        if(y1.length()!=4)
        System.out.println("YEAR IS INVALID");
        if(N<1 || N>100)
        System.out.println("DATE AFTER (N DAYS) OUT OF RANGE");
        else if((dn>1 && dn<366) && (y1.length()==4) && (N>0 && N<101))
        {
            if(dn<mnu[1])
            System.out.println("DATE:"+"\t\t"+dn+" TH "+mna[0]+","+y);
            else
            {
                for(i=1;i<13;i++)
                {
                    dn=dn-mnu[i];
                    m++;
                    if(dn<mnu[m-1])
                    {
                        date=Integer.toString(dn)+" TH "+mna[m-1]+","+y1;
                        System.out.println("DATE: "+date);
                        break;
                    }
                }
            }
            d=Integer.valueOf(date.substring(0,2));
            while(count<N)
            {
                d++;
                count++;
                if(d>mnu[m])
                {
                    d=1;
                    m++;
                }
                if(m>12)
                {
                    m=1;
                    y++;
                    if((y%400==0) || ((y%100!=0)&&(y%4==0)))
                    mnu[2]=29;
                    else
                    mnu[2]=28;
                }
            }
            System.out.println("DATE AFTER (N DAYS): "+d+" TH " + mna[m-1]+","+y);
        }
    }
}