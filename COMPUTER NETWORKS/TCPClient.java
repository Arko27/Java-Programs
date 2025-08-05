import java.io.*;
import java.net.*;
import java.util.*;

public class TCPClient
{
    public static void main (String[] args)
    {
        Scanner sc= new Scanner(System.in);
        String str;
        try
        {
            Socket s=new Socket ("localhost",8080);
            DataOutputStream dout= new DataOutputStream (s.getOutputStream());
            do
            {
                System.out.println("Enter message");
                str=sc.nextLine();
                dout.writeUTF(str);
                dout.flush();
            }
            while (!str.equals("quit"));
            dout.close();
            s.close();
        }
        
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}