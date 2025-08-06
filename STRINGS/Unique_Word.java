import java.util.*;
class Unique_Word
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Word: ");
        String w = sc.nextLine();
        
        int count = 0, i;
        for (i = 0; i < w.length(); i++)
	{
	    count = 1;
	    for (int j = i + 1; j < w.length(); j++)
	    {
	        if (w.charAt(i) == w.charAt(j))
	        {
	            count++;
	        }
	    }
	    if(count > 1)
	    break;
	}
	    
	if (count == 1)
	System.out.println("It is a Unique Word");
	else
        System.out.println("It is not a Unique Word");
    }
}