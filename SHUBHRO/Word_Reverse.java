import java.util.*;;
class Word_Reverse
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String s = sc.nextLine();
        s.trim();
        s = s + " ";
        int i, len;
        char ch;
        String w = "", rev = "";
        len = s.length();
        for(i = 0;i < len; i++)
        {
            ch = s.charAt(i);
            if(ch != ' ')
                w = ch + w;
            
            else
            {
                rev = rev + w + " ";
                w = "";
            }            
        }

        System.out.println("The new String is: " + rev);        
    }
}