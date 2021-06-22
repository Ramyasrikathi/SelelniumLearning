package ramya;

import java.util.Scanner;

public class ReverseString {
	
	public void stringreverse() {
		String initial , rev = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter thhe string to reverse : ");
		initial = sc.nextLine();
		int lenght = initial.length();
		for(int i = lenght - 1 ; i>=0 ; i--)
		rev = rev + initial.charAt(i);
		System.out.println("Reversed String : " + rev);			
		
	}

	public static void main(String[] args) {
		ReverseString rs = new ReverseString();
		rs.stringreverse();
		

	}

}
