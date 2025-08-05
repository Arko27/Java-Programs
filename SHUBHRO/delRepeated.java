import java.util.*;
class delRepeated
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String s = sc.nextLine();
        s = s + " ";
        int i, len = s.length();
        String w = "";
        char ch, ch1;
        for(i = 0; i < len-1; i++)
        {
            ch = s.charAt(i);
            ch1 = s.charAt(i+1);
            if(ch != ch1)
            w = w + ch;
        }
        System.out.println("The new String is: " + w);
    }
}