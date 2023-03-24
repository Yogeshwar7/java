import java.util.Scanner;

public class concatenate_last_first {
    public static void main(String args[]){
        int i;
        Scanner sc=new Scanner(System.in);
        String str1=sc.nextLine();
        String str2=sc.nextLine();
        String result="";

        for(i=0;i<str1.length();i++){
            result+=str1.charAt(i);
        }
        if(str1.charAt(str1.length()-1)==str2.charAt(0)){
            for(i=1;i<str2.length();i++){
                result+=str2.charAt(i);
            }
        }
        else{
            for(i=0;i<str2.length();i++){
                result+=str2.charAt(i);
            }
        }
        System.out.print(result);
    }
    
}
