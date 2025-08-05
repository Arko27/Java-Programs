import java. net.*; 
import java.io.*; 
import java.util.*; 

public class stopWaitClient
{
    public static void main (String[]args)throws Exception
    {
        Socket socket = new Socket ("localhost", 4999);
        Scanner in = new Scanner (System.in); 
        System.out.println ("Enter no. of frames to be sent: ");
        int n = in.nextInt ();
        for(int i=1;i<=n+1;)
        {
            PrintWriter prut = new PrintWriter(socket.getOutputStream());
            if (i==n+1)
            { 
                prut. println("exit");
                prut.flush(); 
                break;
            }
            
            System.out.println ("Frame" + i + "sent");
            prut.println(i);
            prut.flush();
            BufferedReader br = new BufferedReader(new InputStreamReader(socket. getInputStream()));
            String str= br.readLine();
            if (str!=null)
            {
                System.out.println("Acknowledgement received");
                i++;
                Thread.sleep(400);
            }
            else
                prut.println(i);
        }
    }
}