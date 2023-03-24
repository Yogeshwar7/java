
        public class pattern_without_if {
            public static void main(String args[]){
            int i,j,num=1;
            for(i=1;i<=5;i++){
                for(j=5;j>=i;j--){
                    System.out.print(num);
                    num+=2;
                }
                System.out.println();
                num=(i%2==0)?(num+1):(2);
            }
        }
        }

   
