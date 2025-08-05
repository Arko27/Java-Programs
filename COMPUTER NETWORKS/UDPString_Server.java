import java.net.*;
import java.io.*;
import java.util.*;

public class UDPString_Server
{
    public static void main(String[] args)throws IOException
    {
        DatagramSocket ds = new DatagramSocket(8080);
        while(true)
        {
            byte r[] = new byte[1024];
            DatagramPacket dp = new DatagramPacket(r,r.length);
            ds.receive(dp);
            String str=new String(dp.getData());
            if(str.trim().equals("Bye"))
            {
                System.out.println("Bye...");
                break;
            }
            System.out.println("Data Received - "+ str);
        }
    }
}