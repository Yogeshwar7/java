public class index{
    public static void main(String args[])
    {
        int arr[]=new int[]{0,1,-1};
        int index=0;
        int lsum=0,rsum=0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<i;j++)
            {
                lsum+=arr[j];

            }
            for(int k=i+1;k<arr.length;k++)
            {

                rsum+=arr[k];
            }
            if(lsum==rsum)
            {
                System.out.print(i);
                break;
            }
            lsum=0;rsum=0;index++;
        }
        

        }
}