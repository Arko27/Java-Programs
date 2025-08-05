import java.util.*;
class array3
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        int i;
        String a[]=new String[10];
        System.out.println("enter the strings");
        for(i=0;i<10;i++)
        {
            a[i]=sc.nextLine();
        }
        System.out.println("the strings with even charracters");
        for(i=0;i<10;i++)
        {
            if(a[i].length()%2==0)
            System.out.println(a[i]);
        }
    }
}