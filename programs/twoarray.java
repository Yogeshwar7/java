import java.util.Arrays;
import java.util.Scanner;

public class twoarray {
    public static void main(String args[])
    {
        int k;
        Scanner in=new Scanner(System.in);
        System.out.print("enter k");
        k=in.nextInt();
        int n=in.nextInt();
        int m=in.nextInt();
        int arr[][]=new int[n][m];
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                arr[i][j]=k;
                k=k*2;
            }
            System.out.println();
            
         
        }

        System.out.println(Arrays.deepToString(arr));

    int length=arr.length,rsum=0,lsum=0,right=0,left=0,difference;
    for(int o=0;o<length;o++)
    {
        for(int l=0;l<length;l++) 
        {
            if(l==o)

            {
                rsum=arr[l][o]+rsum;
                if(l+o==n-1)
                {
                    lsum=arr[l][o]+lsum;
                }
            }
            else if(l+o==n-1)
            {
                lsum=lsum+arr[l][o];
            }
        }
     right=rsum;
     left=lsum;
       
    }
    difference=right-left;
    System.out.println (difference);


}
}