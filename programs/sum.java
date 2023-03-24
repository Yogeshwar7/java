public class sum{
    public static void main(String args[])
    {
        int a[]=new int[]{2,3,4,1,4,5};
        int n=a.length-1;
        int rsum=0,lsum=0;
        for(int i = 0;i<=n;i++)
        {
            for(int j=a[n];j<=n;j--)
            {
                rsum=a[i]+rsum;
                lsum=a[j]+lsum;
            }
            if(rsum==lsum)
            {
                System.out.print(findIndex(a[i],i+1));
                
            }
        }
    }

    private static char[] findIndex(int i, int j) {
        return null;
    }


}