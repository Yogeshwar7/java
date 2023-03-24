import java.util.*;
public class chicken{
    public static void main(String args[])
    {
        int chicken,flesh,wings,legs,totalchicken,max;
        Scanner in=new Scanner(System.in);
        System.out.println("number of chicken");
        chicken=in.nextInt();
        System.out.println("number of flesh");
        flesh=in.nextInt();
        System.out.println("number of wings");
        wings=in.nextInt();
        System.out.println("number of  legs");
        legs=in.nextInt();
        if(flesh % 2==0||wings % 2==0||legs % 2==0)
        {
            if(flesh<=chicken)
            {
                chicken=flesh;
                System.out.println("no of chickens need to kill"+chicken);

            }
            if(wings<=2*chicken)
            {
                chicken=wings/2;
                System.out.println("no of chickens need to kill" +chicken);
            }
            
            if(legs<=2*chicken)
            {
                chicken=legs/2;
                System.out.println("no of chickens need to kill" +chicken);
            }    

                
            }       
        else
        {
            if(flesh<=chicken)
            {
                chicken=flesh;
                System.out.println("no of chickens need to kill for flesh"+chicken);

            }
            if(wings<=2*chicken)
            {
                chicken=wings/2;
                System.out.println("no of chickens need to kill for wings" +chicken);
            }
            
            if(legs<=2*chicken)
            {
                chicken=legs/2+1;
                System.out.println("no of chickens need to kill for legs" +chicken);
            }    

            }
            if(flesh>wings)
            {
                max=flesh;
                
            }
            else{
                max=wings;
            }
            if(max>legs)
            {
                totalchicken=max;
                
            }
            else{
                
                max=legs;
            }
          if(max==flesh)
          {
            totalchicken=flesh;
          }
          else
          {
            if(max%2==0)
            {
            totalchicken=max/2;
            System.out.println(" " +totalchicken);
            }
            else
            {
                totalchicken=max/2+1;
                System.out.println(" " +totalchicken);
            }
          }
          System.out.println("alive");
          int remainingwings=chicken*2-wings;
          System.out.println("remaing wing"+remainingwings);
          int remainingflesh=chicken-flesh;
          System.out.println("remainingflesh"+remainingflesh);
         int remaininglegs=chicken*2-legs;
          System.out.println("remaininglegs"+remaininglegs);  

          System.out.println("dead");
           int remainflesh=flesh-totalchicken;
          System.out.println("remainflesh"+remainflesh);
          int remainlegs=totalchicken*2-legs;
          System.out.println("remainlegs"+remainlegs);
          int remainwings=totalchicken*2-wings;
          System.out.println("remainwings"+remainwings);

           
        }
}
