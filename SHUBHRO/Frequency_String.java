import java.util.*;
class Frequency_String
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE STRING");
        int i, j;
        String w = "",v="",c="";
        char ch1, ch2;
        String str = sc.nextLine();
        str = str.trim();
        int len = str.length();
        str = str.substring(0,len-1) + " " + str.charAt(len-1);
        len = str.length();
        if (str.charAt(len - 1) != '.' && str.charAt(len - 1) != '?' && str.charAt(len - 1) != '!')
            System.out.println("INCORRECT TERMINATING CHARACTER. INVALID INPUT");
        else
        {
            System.out.println("WORD\t\tCOUNT");
            for (i = 0; i < len - 1; i++)
            {
                ch1 = str.charAt(i);
                if (ch1 != ' ')
                    w = w + ch1;
                else {
                    for (j = 0; j < w.length(); j++)
                    {
                        ch2 = w.charAt(j);
                        if (ch2 == 'A' || ch2 == 'E' || ch2 == 'I' || ch2 == 'O' || ch2 == 'U')
                            v+="V";
                        else
                            c+="C";
                    }
                    System.out.println(w+"\t\t"+v+"\n\t\t"+c+"\n");
                    w="";
                    v="";
                    c="";
                }
            }
        }
    }
}