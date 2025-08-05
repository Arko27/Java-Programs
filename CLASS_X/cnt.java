import java.util.*;
class cnt
{
    void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        int i,l=0,d=0,uc=0,lc=0;
        char ch;
        String str = sc.nextLine();
        for(i=0;i<str.length();i++)
        {
            ch = str.charAt(i);
            if(Character.isLetter(ch)==true)
            l++;
            if(Character.isDigit(ch)==true)
            d++;
            if(Character.isUpperCase(ch)==true)
            uc++;
            if(Character.isLowerCase(ch)==true)
            lc++;
        }
        System.out.println("No. of Letters: "+l);
        System.out.println("No. of Digits: "+d);
        System.out.println("No. of Uppercase letters: "+uc);
        System.out.println("No. of Lowercase letters: "+lc);
    }
}