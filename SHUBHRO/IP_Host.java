import java.net.InetAddress;
import java.io.*;

public class IP_Host
{
    public static void main(String[] args)throws IOException
    {
        InetAddress addr = InetAddress.getLocalHost();
        String hostName  = addr.getHostName();
        System.out.println(addr);
        System.out.println(hostName);
    }
}