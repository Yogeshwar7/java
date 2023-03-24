public class numpattern{
    public static void main(String args[])
    {
        int row,column,n=5;
        for(row=1;row<=n;row++)
        {
            for(column=5;column>=row;column--)
            {
                System.out.print(column+" ");
            }
            System.out.println();
        }
    }
}