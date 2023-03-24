import java.util.Arrays;

public class secmin{
    public static void main(String args[])
    {
        int i,j;
        int arr[][]={{4,3,8},{7,5,4},{9,1,6}};
        System.out.println(Arrays.deepToString(arr));
        int max=arr[0][0],min=arr[0][0];
        int index1=0,index2=0;
        
       for(i=0;i<arr.length;i++)
        {
            for(j=1;j<arr.length;j++)
            {
                if(max>arr[i][j])
                {
                    max=arr[i][j];
                }
            }
         }
         for(int l=0;l<arr.length;l++)
         {
            for(int k=1;k<arr.length;k++)
            {
                if(min>arr[l][k])
                { 
                    if(arr[l][k]!=max)
                    {
                    min=arr[l][k];
                    index1=l;
                    index2=k;
                    }
                }
                
            }
            
         }
         System.out.println(+index1 +","+index2);
        System.out.print("first min:"+max);
        System.out.print("Second min:"+min);
        
    }
}
