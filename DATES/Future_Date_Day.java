import java.util.*;
class Future_Date_Day
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);        
        int month[]={0,31,28,31,30,31,30,31,31,30,31,30,31};
        String day[]={"SUNDAY","MONDAY","TUESDAY","WEDNESDAY","THURSDAY","FRIDAY","SATURDAY"};        
        System.out.println("Enter the date in dd/mm/yyyy format");
        String date=sc.nextLine();        
        System.out.println("Enter the day of that given date");
        String dy=sc.nextLine();        
        int k=0,i,count=0,pos=0,pos1;        
        int d=Integer.valueOf(date.substring(0,2));
        int m=Integer.valueOf(date.substring(3,5));
        int y=Integer.valueOf(date.substring(6));        
        if((y%400==0) || ((y%100!=0)&&(y%4==0)))
        month[2]=29;
        if(m<0 || m>12 || d<0 || d>month[m] || y<0 || y>9999)
        System.out.println("Invalid date");
        else
        {
            System.out.println("Enter no. of days after which the future date is to be dispalyed");
            int days=sc.nextInt();            
            while(count<days)
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
            System.out.println("Entered date:"+date);
            System.out.println("Future Date:"+d+"/"+m+"/"+y);                        
            for(i=0;i<8;i++)
            {
                if(dy.equalsIgnoreCase(day[i])==true)
                {
                    pos=i;
                    break;
                }
            }
            pos1=(days+pos)%7;
            System.out.println("Day of the week is "+day[pos1]);
        }
    }
}