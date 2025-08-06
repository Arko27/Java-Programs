import java.util.*;
public class vowel_consonants
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a string");
        String s=sc.nextLine();
        int len=s.length();
        char ch;
        int i,v=0,c=0;
        for(i=0;i<len;i++)
        {
            ch=s.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
            v++;
            else
            c++;
        }
        System.out.println("Vowels number is :"+v);
        System.out.println("Consonants number is :"+c);
    }
}