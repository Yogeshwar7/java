public class validation{
    public static void main(String args[])
    {
        int capital=0,num=0,ch=0;
        
        int i;
        String str="Yoesh";
        int length=str.length();
        char[] arr=str.toCharArray();

        if(length>4 && !Character.isDigit(arr[0]))
        {
          for(i=0;i<length;i++)
         
          {
            
             if(arr[i]!='/')
              {
                if(Character.isUpperCase(arr[i]) && capital==0 || Character.isDigit(arr[i]) && num==0)
                {
                    capital++;
                    num++;
                }
            } 
            else
            {
               ch++;
            }
           }
           if(capital!=0 && num!=0 && ch!=0)
           {
            System.out.println("1 valid");
           }
           else
           {
            System.out.println("0 invalid");
 
           }
        }
       else
        {
            System.out.println("0 not valid");
        }
    }
}