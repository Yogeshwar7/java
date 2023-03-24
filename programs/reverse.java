public class reverse {
    public static void main(String args[]){
        String str="I! love: zoho";
        char[]ch =str.toCharArray();
        int i=0,j=ch.length-1;
        while(i<j)
        {
            if((ch[i]==' ')&&(!Character.isDigit(ch[i]))&&(!Character.isLetter(ch[i])))
            {
               i++;
            }
            else if((ch[j]==' ')&&(!Character.isDigit(ch[j]))&&(!Character.isLetter(ch[j]))){
                j--;
            }
            else{
                char temp=ch[i];
                ch[i]=ch[j];
                ch[j]=temp;
                i++;
                j--;
            }
        }
        System.out.print( new String(ch));
    }
    
}
