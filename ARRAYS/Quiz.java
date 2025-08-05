import java.util.*;
class Quiz
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no. of Participants");
        int n=sc.nextInt();
        if(n<4 || n>11)
        System.out.println("INVALID INPUT");
        else if(n>3 && n<11)
        {
            char p[][]=new char[n][5];
            char a[]=new char[5];
            int q[]=new int[n];
            int i,j,max=0,t=0,k=0;
            System.out.println("Enter the answers of the participants");
            for(i=0;i<n;i++)
            {
                System.out.println("Participant "+(i+1)+":");
                for(j=0;j<5;j++)
                {
                    p[i][j]=sc.next().charAt(0);
                }
            }
            System.out.println("Give the answer Key");
            for(i=0;i<5;i++)
            {
                a[i]=sc.next().charAt(0);
            }
            System.out.println("Result--->");
            for(i=0;i<n;i++)
            {
                t=0;
                for(j=0;j<5;j++)
                {
                    if(a[j]==(p[i][j]))
                    t++;
                }
                q[i]=t;
                System.out.println("Participant "+(i+1)+"="+t);
                if(t>max)
                {
                    max=t;
                    k=i;
                }
            }
            System.out.println("Highest Score: Participant "+(k+1));
            for(i=0;i<n;i++)
            {
                if((q[i]==max) && (i!=k))
                System.out.println("Highest Score: Participant "+(i+1));
                else
                System.out.print("");
            }
        }
    }
}