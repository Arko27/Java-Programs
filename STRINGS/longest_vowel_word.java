import java.util.*;
class longest_vowel_word
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a sentence");
        String s=sc.nextLine();
        s = s +" ";
        String w="",max="";
        int i,j,len=s.length(),p=0, v = 0;
        char c,f;
        for(i=0;i<len;i++)
        {
            c=s.charAt(i);
            if(c!=' ')
            w=w+c;
            else
            {
                v = 0;
                for(j=0;j<w.length();j++)
                {
                    f=w.charAt(j);
                    if(f == 'A' || f == 'E' || f == 'I' || f == 'O' || f == 'U')
                    v++;
                }
                if(v > p)
                {
                    p = v;
                    max = w;
                }
                w = "";
            }
        }
        System.out.println("Longest word with vowels is "+max);
    }
}