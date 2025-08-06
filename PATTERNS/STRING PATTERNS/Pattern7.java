/* 1  2  3  4  5
 * 6  7  8  9
 * 10 11 12
 * 13 14
 * 15
 */

class Pattern7
{
    void main()
    {
        int i,j,c=1;
        for(i=1;i<=5;i++)
        {
            for(j=5;j>=i;j--)
            {
                System.out.print(c+"  ");
                c++;
            }
            System.out.println();
        }
    }
}