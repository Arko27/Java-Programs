import java.util.*;
class toggle
{
    void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        int i;
        String w="";
        char ch;
        String str = sc.nextLine();
        for(i=0;i<str.length();i++)
        {
            ch = str.charAt(i);
            if(Character.isUpperCase(ch)==true)
            w = w + Character.toLowerCase(ch);
            else
            w = w + Character.toUpperCase(ch);
        }
        System.out.println("Toggle Case: "+w);
    }
}