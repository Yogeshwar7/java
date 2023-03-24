import java.util.Arrays;

public class sort_by_sum_of_digits {
    public static void main(String args[]){
        int i,j;
        int arr[]=new int[]{12,13,11,9,8};
        for(i=0;i<arr.length;i++){
            for(j=i+1;j<arr.length;j++){
                if((arr[i]/1)%10>(arr[j]/1)%10){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.print(Arrays.toString(arr));

    }
    
}

