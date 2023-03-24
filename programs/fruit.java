import java.util.Scanner;

public class fruit {

	public static void main(String[] args) {
	
		int kg,x,y,z;
		double A,B,C;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter total kg");
		kg=sc.nextInt();
		System.out.println("Enter  A kg");
		A=sc.nextDouble();
		System.out.println("Enter B kg");
		B=sc.nextDouble();
		System.out.println("Enter C kg");
		C=sc.nextDouble();
		for(x=1;x<kg;x++) {
			for(y=1;y<kg;y++) {
				for(z=1;z<kg;z++) {
					if((x+y+z == 100) && (A*x)+(B*y)+(C*z)==kg) {
						System.out.println("A is "+x);
						System.out.println("B is "+y);
						System.out.println("C is "+z);
						System.out.println("--------NEXT POSSIBLE IS----");
						break;
					}
				}
			}
		}


	}

}