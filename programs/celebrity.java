import java.util.Scanner;

public class celebrity {
    public static void main(String args[]){
        int i,j,n;
        Scanner in=new Scanner(System.in);
        n=in.nextInt();
        int arr[][]=new int[n][n];
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                 arr[i][j]=in.nextInt();
            }
        }
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                if(arr[i][j]==1){
                    if(arr[j][i]!=1){
                        for(int k=i+2;k<n;k++){
                            if(arr[k][j]==1){
                                System.out.print("celebrities are" +j);
                            }
                        }
                    }
                    else{
                        System.out.print("-1");
                        i++;
                    }
                }
            }
        }
    }
    
}
