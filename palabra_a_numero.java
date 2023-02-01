package exercise;
import java.util.Scanner;
import java.util.StringTokenizer;
/* Ingresar una palabra y mostar cuantos caracteres tiene esta*/
public class palabra_a_numero {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese una palabra");
		String palabra=sc.next();
	
	for (int i = 0; i < palabra.length(); i++) {
		System.out.println("Letra "+(i+1)+" :"+palabra.substring(i, i+1));
		
	}
		System.out.println("total letras "+palabra.length());
	}

}
