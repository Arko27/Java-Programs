import java.util.*;
class Anagram
{
    static int c=0;
    void display(String s1,String s2)
    {
        int i;
        if(s2.length()<=1)
        {
            c++;
            System.out.println(s1+s2);
        }
        else
        {
            for(i=0;i<s2.length();i++)
            {
                String x=s2.substring(i,i+1);
                String y=s2.substring(0,i);
                String z=s2.substring(i+1);
                display(s1+x,y+z);
            }
        }
    }
    
    public static void main(String args[])
    {
        Anagram obj = new Anagram();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a word");
        String s=sc.nextLine();
        System.out.println("The anagrams are: ");
        obj.display("",s);
        System.out.println("Total number of anagrams= "+c);
    }
}