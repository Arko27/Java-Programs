import java.util.*;
class Vowel_Const {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = sc.nextLine();
        str += ' ';
        str = str.toLowerCase();
        int i, v = 0, c = 0;
        String w = "", wrd, space;
        char ch;
        int len = str.length();
        System.out.println("\nWord \t\t\t Vowels \t Consonants");
        for (i = 0; i < len; i++)
        {
            ch = str.charAt(i);
            if (ch != ' ')
            {
                w = w + ch;
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                    v++;
                else
                    c++;
            }
            else
            {
                wrd = Character.toUpperCase(w.charAt(0)) + w.substring(1);
                space = " ".repeat(25-w.length());
                System.out.println(wrd + space + v + "\t\t " + c);
                w = "";
                v = 0;
                c = 0;
            }
        }
    }
}