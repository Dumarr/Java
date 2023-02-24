package clase_abstracta;

public class main {
	public static void main(String[] args) {
		animal p= new perro();
		p.comer();
		p.moverse();
		
		animal a= new ave();
		a.comer();
		a.moverse();
	}

}
