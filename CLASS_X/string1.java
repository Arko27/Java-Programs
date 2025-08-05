import java.util.*;
class string1
{
void main()
{
    Scanner sc=new Scanner(System.in);
    char ch;
    int i;
    System.out.println("Enter a string");
    String s=sc.nextLine();
    for(i=0;i<s.length();i++)
    {
        ch=s.charAt(i);
        System.out.println(ch);
    }
}
}

    
