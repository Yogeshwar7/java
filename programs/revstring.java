public class revstring{
    public static void main(String args[])
    {
        String str="he.is.tall";
        int n=str.length();
        int i;
        System.out.print(n);
        
        char[] arr=str.toCharArray();
        for( i=1;i<=n;i++)
        {
            arr[i-1]=arr[n-i];
            
        }
               for (i=1;i<n;i++)
        {
            if(arr[n-i]!=0)
            {
            arr[n-i]=arr[n-i-1];
            }
        }System.out.print(arr);
 


    }
}