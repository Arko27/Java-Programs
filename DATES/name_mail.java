/*WAP to input an e-mail id and extract the name from it.
    Input: shounakdutta@gmail.com
           pramamondal@gmail.com
    Output: shounakdutta
            pramamondal
 */
import java.util.*;
class name_mail
{
    void main()
    {
        Scanner sc = new Scanner(System.in);
        String s;
        System.out.println("Enter a String: ");
        s = sc.nextLine();
        System.out.println("Your name is "+s.substring(0,s.indexOf('@')));
    }
}