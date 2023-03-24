public class fruits{
    public static void main(String args[])
    {
       float akg,bkg,ckg;
       float totalkg;
       int acount,bcount,ccount;
       int i,j,k;
       System.out.print("enter the each fruit kg");
       Scanner in=new Scanner(System.in);
       akg=in.nextInt();
       bkg=in.nextInt();
       ckg=in.nextInt();

       acount=totalkg/akg;
       bcount=totalkg/bkg;
       ccount=totalkg/ckg;
        for (int i = 1; i <= 100; i++) {
            for (int j = 1; j <= 100; j++) {
                for (int k = 1; k <= 100; k++) {
                    if (i * akg+ j * bkg + k *ckg or == amount && i + j + k == 100) {
                        System.out.println(i + "+" + j + "+" + k + "=" + 100);
                        count++;
                    }
                }
            }
    }

}