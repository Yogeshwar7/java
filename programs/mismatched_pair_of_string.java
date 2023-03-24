public class mismatched_pair_of_string {
    public static void main(String args[]){
        int i=0;
        String str1="abcddefgikom";
        String str2="abdcdeffgkim";
        char[] ch=str1.toCharArray();
        char[]ch1=str2.toCharArray();

        int n=str1.length();
        int m=str2.length();
        if(n==m){
            while(i<n){
                if(ch[i]!=ch1[i]){
                    {
                        if(ch[i+1]!=ch1[i+1])
                        {
                            System.out.println(ch[i]+" "+ch[i+1]+","+ch1[i]+" "+ch1[i+1]);
                            
                        }
                        else{
                            System.out.println(ch[i]+","+ch1[i]);
                        }
                        i++;
                    }
                }
                i++;
                
            }
        }



    }
    
}
