import java.net.InetAddress;
import java.net.UnknownHostException;
import java.io.*;
import java.util.*;

public class IP_Website
{
    public static void main(String[] args)throws IOException
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an IP Address");
        String addr = sc.nextLine();
        try
        {
            InetAddress ip = InetAddress.getByName(addr);
            if(ip.isReachable(5000))
                System.out.println("IP is Reachable: "+ip);
        }
        
        catch(Exception e)
        {
            System.out.println("Exception Found: "+e.getMessage());
        }
    }
}