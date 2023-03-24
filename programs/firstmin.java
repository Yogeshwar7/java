public class firstmin{
    public static void main(String args[])
    {
        int a[][]={{2,5,8},{9,7,3},{6,4,8}};
        int c=a[0][0];
        int i,j,index1=0,index2=0;
        for(i=0;i<a.length;i++)
        {
            for(j=1;j<a.length;j++)
            {
                if(c>a[i][j])
                {
                c=a[i][j];
                }
            }
         }
        System.out.print(c);
    }
}        