package ramya;

import java.util.Scanner;

public class JavaLearning {
	Scanner scanner = new Scanner(System.in);
	
	 public void readinput() {
		 
			System.out.println("Enter the number : ");
		    int x = scanner.nextInt();
			int y = scanner.nextInt();
			int z = scanner.nextInt();
			scanner.close();
			System.out.println("Enter the numbers : " );
			System.out.println(x );
			System.out.println(y);
			System.out.println(z);
			
	 }
	 
	 public void ifelse() {
		 int n = scanner.nextInt();
		 if(n%2!=0) {
			 System.out.println("Weird");
		 } 
		 if (n%2==0) {
			 if(n>=2 && n<=5) {
				 System.out.println("Not weird");
			 }
			 if(n>=6 && n<=20) {
				 System.out.println("Weird");
			 }
			 if(n>20) {
				 System.out.println("Not weird");
			 }
		 }
		 
	 }
	 
	 public void readinputtwo() {
		 int a = scanner.nextInt();
		 double b = scanner.nextDouble();
		 scanner.nextLine();
		 String c = scanner.nextLine();
		 System.out.println("String: " + c);
		 System.out.println("Double: "+ b);
		 System.out.println("Int: "+ a);
	 }
	public static void main(String[] args) {
		JavaLearning jl = new JavaLearning();
		jl.readinputtwo();
	}

}
