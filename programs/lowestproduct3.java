import java.util.Arrays;

public class lowestproduct3 {
    public static void main(String args[]){
        int i,j;
        int arr[]=new int[]{1,2,-4,-9,5};
        int n=arr.length;
        for(i=0;i<n;i++)
        {
            for(j=i+1;j<n;j++)
            {
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        
        System.out.print(Arrays.toString(Arrays.copyOfRange(arr,0,2)));
    }
}
