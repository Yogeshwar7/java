import java.util.Arrays;
import java.util.Scanner;

public class arrayaddition {
    public static void main(String args[]){
        int carry=0,ones=0;
        
        int arr[]=new int[]{5,6,3};
        int arr1[]=new int[]{8,4,2};
        int n=arr.length,m=arr1.length;
        int[] res = new int[Math.max(n, m) + 1];
        int k=res.length-1;
        
        /*for(i=0;i<n;i++){
            arr[i]=in.nextInt();
            arr1[i]=in.nextInt();
        }*/
        System.out.print(Arrays.toString(arr));
        System.out.print(Arrays.toString(arr1));
        int i=arr.length-1;
        while(i>=0){
            int add=arr[i]+arr1[i]+carry;
            carry=(add/10)%10;
            if(i!=0){
            ones=(add/1)%10;
            res[k--]=ones;
            }
            else{
                res[k--]=add;
            }
            i--;
        }
        /*StringBuffer buffer=new StringBuffer(str);
        String reverse=buffer.reverse().toString();
        System.out.println(reverse);*/
        //System.out.print(Arrays.toString(res));
        for (int j = 0; j < res.length; j++) {
            System.out.print(res[j]);
        }
    }
    
}
