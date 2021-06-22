package ramya;

import java.util.Scanner;

public class swappin {

	public static void main(String[] args) {
		
		int x,y,t;
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter values of x and y");
        x = sc.nextInt();
        y = sc.nextInt();
        System.out.println("numbers before swappin" + x + " "+ y);
        t = x;
        x = y;
        y= t;
        System.out.println("numbers after swappin "+ x + " " + y);

	}

}
