import java.net.*;
import java.io.*;
import java.util.*;

public class Calc_UDPClient
{
    public static void main(String[] args) throws Exception
    {
        Scanner sc=new Scanner(System.in);
        
        DatagramSocket ds=new DatagramSocket();
        System.out.print("Enter first integer: ");
        int i=sc.nextInt();
        System.out.print("Enter second integer: ");
        int j=sc.nextInt();
        System.out.print("1. ADD\n2. SUBTRACT\n3. MULTIPLY\n4. DIVISION\n");
        System.out.print("Enter Your Choice: ");
        int ch=sc.nextInt();
        
        InetAddress IP = InetAddress.getLocalHost();
        
        byte num1[] = String.valueOf(i).getBytes();
        DatagramPacket dp1 = new DatagramPacket(num1,num1.length,IP,1889);
        ds.send(dp1);
        
        byte num2[] = String.valueOf(j).getBytes();
        DatagramPacket dp2 = new DatagramPacket(num2,num2.length,IP,1889);
        ds.send(dp2);
        
        byte choice[] = String.valueOf(ch).getBytes();
        DatagramPacket dp3 = new DatagramPacket(choice,choice.length,IP,1889);
        ds.send(dp3);
        
        byte data[]=new byte[1024];
        DatagramPacket dp4=new DatagramPacket(data,data.length);
        ds.receive(dp4);
        
        String str=new String(dp4.getData());
        System.out.println("Result: "+str);
    }
}