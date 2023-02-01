package exercise;

import java.util.Scanner;

public class n1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String n []=new String[5];
		for (int i = 0; i<n.length; i++) {
			
			System.out.println("Digite un nombre");
			n[i]=sc.next();
		}
		
		for (int i = 0; i < n.length; i++) {
			System.out.println(n[i]);
		}
		
	}

}
