import java.net.*;
import java.io.*;
import java.util.*;

public class UDPString_Client
{
    public static void main(String[] args) throws Exception
    {
        Scanner sc=new Scanner(System.in);    
        
        DatagramSocket ds=new DatagramSocket();
        InetAddress IP=InetAddress.getLocalHost();
        while(true)
        {
            System.out.println("Enter a String");
            String str = sc.nextLine();
            byte b[] = str.getBytes();
            DatagramPacket dp=new DatagramPacket(b,b.length,IP,8080);
            ds.send(dp);
            if(str.equals("Bye"))
            break;
        }
    }
}