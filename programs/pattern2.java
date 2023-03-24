public class pattern2{
    public static void main(String args[])
    {
        int row,column,n=5,k;
    
        for (row=1;row<=n;row++)
        {
            for(column=5;column>=row;column--)
            {
              System.out.print(column);
            }
            System.out.println();

            for(k=1;k<=row;k++)
            {
                System.out.print( " ");
            }
            
        }
        
    }
}

    
