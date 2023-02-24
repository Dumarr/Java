package clase_abstracta;

public abstract class  animal {
	private String nombre;
	public animal() {
	}
	public void comer() {
		System.out.println("el "+nombre+" está comiendo");
	}

	
	public abstract void moverse();
	
		public void setNombre(String s) {
			nombre=s;
	}
		public String getNombre() {
			return nombre;
		}

}
