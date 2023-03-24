import java.util.*;
public class subarray {
    public static void main (String args[]){
        int i,j,n,sum=0;
        int arr[]=new int[]{3,2,4,5,1,6};
        n=arr.length;
        int m=11;
        for(i=0;i<n;i++){
            sum=sum+arr[i];
            outer:
            for(j=i+1;j<n;j++)
            {
                sum=sum+arr[j];
                if(sum==m){
                    System.out.print(Arrays.toString(Arrays.copyOfRange(arr,i,j+1)));
                }
                else if(sum>m){
                    break outer;
                }
            }
            sum=0;
        }
    }
    
}
