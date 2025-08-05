import java.util.Calendar;
public class CalendarClass
{
    public static void main()
    {
        Calendar now = Calendar.getInstance();
        System.out.println("Current Date:"+(now.get(Calendar.MONTH)+1)+"-"+now.get(Calendar.DATE)+"-"+now.get(Calendar.YEAR));
        now.add(Calendar.DATE,10);
        System.out.println("Changed Date:"+(now.get(Calendar.MONTH)+1)+"-"+now.get(Calendar.DATE)+"-"+now.get(Calendar.YEAR));
    }
}