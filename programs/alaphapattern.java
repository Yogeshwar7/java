public class alaphapattern{
    public static void main(String args[])
    {
        char ch='z';
        char ch2='A';
        int n=4,m=3;
        for(int row=1;row<=n;row++)
        {
            for(int column=1;column<=m;column++)
            {
                if(row%2!=0)
                {
                    System.out.print(ch);
                    ch--;
                }
                else
                {


                    System.out.print(ch2);
                    ch2++;
                }
                
            }
            System.out.println();
        }
    }
}