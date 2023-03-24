import java.util.Scanner;

public class divisor{
    public static void main(String args[])
    {
        int N,a,b,c,count=0;
        Scanner in=new Scanner(System.in);
        System.out.println("Number of test caseses");
        N=in.nextInt();
        a=in.nextInt();
        b=in.nextInt();
        c=in.nextInt();

        for(int i=2;i<=N;i++)
        {
            if((i%a==0)||(i%b==0)||(i%c==0))
            {
                count=count+1;
            }
        }
        System.out.println(count);
    }
}