import java.util.*;
class Sentence
{
    public static void main(String[] args)
    {
        Scanner sc  =new Scanner(System.in);
        System.out.println("Enter the Sentence: ");
        String s = sc.nextLine();
        int len = s.length();
        int i,c=0;
        char ch,first, last;
        String s1="",vow="",non_vow="", w="";
        if(s.charAt(len-1) == '.' || s.charAt(len-1) == '?' || s.charAt(len-1) == '!')
        {
            s1 = s.replaceAll("\\s+"," ").trim();
            len = s1.length();

            for(i = 0; i < len; i++)
            {
                ch = s1.charAt(i);
                if(ch != ' ' && ch !='.' && ch != '?' && ch!= '!')
                    w = w + ch;
                else
                {
                    first = w.charAt(0);
                    last = w.charAt(w.length()-1);
                    if((first == 'A' || first == 'E' || first == 'I' || first == 'O' || first == 'U') &&
                        (last == 'A' || last == 'E' || last == 'I' || last == 'O' || first == 'U'))
                    {
                        c++;
                        vow = vow + w +" ";
                    }
                    else
                        non_vow = non_vow + w + " ";
                    w = "";
                }                
            }

            System.out.println("Number of Words beginning and Ending with Vowels are: "+ c);
            System.out.println("New String : " + vow + non_vow);
        }
        else
        System.out.println("Invaid Input");
    }
}