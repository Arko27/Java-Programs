import java.net.*;
import java.io.*;
import java.util.*;

public class Calc_UDPServer
{
    public static void main (String[] args) throws Exception
    {
        DatagramSocket ds=new DatagramSocket(1889);
               
        byte num1[]=new byte[1024];
        DatagramPacket dp1=new DatagramPacket(num1,num1.length);
        ds.receive(dp1);

        byte num2[]=new byte[1024];
        DatagramPacket dp2=new DatagramPacket(num2,num2.length);
        ds.receive(dp2);
        
        byte choice[]=new byte[1024];
        DatagramPacket dp3=new DatagramPacket(choice,choice.length);
        ds.receive(dp3);
        
        String str1=new String(dp1.getData());
        String str2=new String(dp2.getData());
        String str3=new String(dp3.getData());
        
        System.out.print("Number received: "+str1);
        System.out.print("Number received: "+str2);
        System.out.print("Option received: "+str3);
        
        int n1 = Integer.parseInt(str1.trim());
        int n2 = Integer.parseInt(str2.trim());
        int c = Integer.parseInt(str3.trim());
        
        int res = 0;
        switch(c)
        {
            case 1:
            res = n1 + n2;
            break;
            
            case 2:
            res = n1 - n2;
            break;
            
            case 3:
            res = n1 * n2;
            break;
            
            case 4:
            res = n1/n2;
            break;
        }
        
        byte b[]=String.valueOf(res).getBytes();
        InetAddress IP = InetAddress.getLocalHost();
        DatagramPacket dp4 = new DatagramPacket(b,b.length,IP,dp1.getPort());
        ds.send(dp4);
    }
}