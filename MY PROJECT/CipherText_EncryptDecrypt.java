import java.util.*;
public class CipherText_EncryptDecrypt
{
    static char smallEncDec(char smChar, int smShift, int smCh)
    {
        int smEncDec;
        if(smCh == 1)
        {
            smEncDec = smChar + smShift;
            if(smEncDec > 122)
                return((char)(smEncDec - 26));
            else
                return((char)smEncDec);
        }
        else if(smCh == 2)
        {
            smEncDec = smChar - smShift;
            if(smEncDec < 97)        
                return((char)(smEncDec + 26));
            else
                return((char)smEncDec);
        }
        return ' ';
    }
    static char capitalEncDec(char cpChar, int cpShift, int cpCh)
    {
        int cpEncDec;
        if(cpCh == 1)
        {
            cpEncDec = cpChar + cpShift;
            if(cpEncDec > 90)
                return((char)(cpEncDec - 26));
            else
                return((char)cpEncDec);
        }
        else if(cpCh == 2)
        {
            cpEncDec = cpChar - cpShift;
            if(cpEncDec < 65)
                return((char)(cpEncDec + 26));
            else
                return((char)cpEncDec);
        }
        return ' ';
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("1. Encrypt a Message");
        System.out.println("2. Decrypt a Message");
        System.out.println("\nEnter Your Choice: ");
        int n = sc.nextInt();
        
        String s;
        int i, shift;
        char ch, c;
        switch(n)
        {
            case 1:
            
            System.out.println("\nEnter a Message to be encrypted: ");
            sc.nextLine();
            s = sc.nextLine();
            System.out.print("\nEnter the shift: ");
            shift = sc.nextInt();
            System.out.println("\nThe Encrypted String is: ");
            for(i = 0; i < s.length(); i++)
            {
                ch = s.charAt(i);
                if(Character.isLowerCase(ch))
                {
                    c = smallEncDec(ch, shift, n);
                    System.out.print(c);
                }
                else if(Character.isUpperCase(ch))
                {
                    c = capitalEncDec(ch, shift, n);
                    System.out.print(c);
                }
                else
                System.out.print(ch);
            }
            break;
            
            case 2:
            
            System.out.println("\nEnter a Message to be decrypted: ");
            sc.nextLine();
            s = sc.nextLine();
            System.out.println("\nEnter the shift: ");
            shift = sc.nextInt();
            System.out.println("\nThe Decrypted String is: ");
            for(i = 0; i < s.length(); i++)
            {
                ch = s.charAt(i);
                if(Character.isLowerCase(ch))
                {
                    c = smallEncDec(ch, shift, n);
                    System.out.print(c);
                }
                else if(Character.isUpperCase(ch))
                {
                    c = capitalEncDec(ch, shift, n);
                    System.out.print(c);
                }
                else
                System.out.print(ch);
            }
            break;
            
            default:
            System.out.println("Wrong Choice");
        }        
    }
}