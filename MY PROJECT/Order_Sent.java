import java.util.*;
class Order_Sent
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a paragraph of sentences:");
        String paragraph = sc.nextLine();
        String[] sentences = paragraph.split("[.?!]");
        int i, j, tempCount;
        
        for (i = 0; i < sentences.length; i++)
            sentences[i] = sentences[i].trim();
        
        int[] wordCounts = new int[sentences.length];
        for (i = 0; i < sentences.length; i++)
        {
            String sentence = sentences[i];
            int count = 0;
            boolean wordStarted = false;            
            for (j = 0; j < sentence.length(); j++)
            {
                char ch = sentence.charAt(j);
                if (Character.isLetter(ch))
                {
                    if (!wordStarted)
                    {
                        wordStarted = true;
                        count++;
                    }
                }
                else
                    wordStarted = false;
            }            
            wordCounts[i] = count;
        }
        for (i = 0; i < sentences.length - 1; i++)
        {
            for (j = 0; j < sentences.length - i - 1; j++)
            {
                if (wordCounts[j] > wordCounts[j + 1])
                {
                    tempCount = wordCounts[j];
                    wordCounts[j] = wordCounts[j + 1];
                    wordCounts[j + 1] = tempCount;
                    String tempSentence = sentences[j];
                    sentences[j] = sentences[j + 1];
                    sentences[j + 1] = tempSentence;
                }
            }
        }
        System.out.println("Sentences sorted by word count:");
        for (i = 0; i < sentences.length; i++)
            System.out.println(sentences[i]);
    }
}