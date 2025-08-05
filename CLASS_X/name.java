/*WAP to input a Name and print in the following format
* Input: "Aakash Kumar Gupta"
* Output: "A.K. Gupta"
*/
import java.util.*;
class name
{
    void main()
    {
        Scanner sc = new Scanner(System.in);
        String s,w="",r="";
        int i,j;
        char ch;
        System.out.println("Enter a String");
        s=sc.nextLine();
        s=s.trim();
        s=" "+s;
        int len=s.length();
        for (i=len-1;i>=0;i--)
        {
            ch = s.charAt(i);
            if(ch!=' ')
            w = ch + w;
            else
            break;
        }
        for(j=0;j<i;j++)
        {
            ch = s.charAt(j);
            if(ch == ' ')
            r = r + s.charAt(j+1)+".";
        }
        System.out.println("the new String is "+r+w);
    }
}