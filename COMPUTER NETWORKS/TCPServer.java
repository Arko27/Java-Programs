import java.io.*;
import java.net.*;

public class TCPServer
{
    public static void main(String[] args)
    {
        String str;
        try
        {
            ServerSocket ss = new ServerSocket(8080);
            Socket s=ss.accept();
            do
            {
                DataInputStream dis = new DataInputStream(s.getInputStream());
                str = (String) dis.readUTF();
                System.out.println("message = " +str);
            }
            while(!str.equals("quit"));
            ss.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}