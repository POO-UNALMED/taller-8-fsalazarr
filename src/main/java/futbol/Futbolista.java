package futbol;

public abstract class Futbolista implements Comparable<Object> {
	private int edad;
	private String nombre;
	private final String posicion;
	
	public Futbolista(String nombre, int edad, String posicion) {
		// TODO Auto-generated constructor stub
		this.nombre = nombre;
		this.edad = edad;
		this.posicion = posicion;
	}
	public Futbolista() {
		this("Maradona",30,"delantero");
	}
	public int compareTo(Object f) {
		return 0;
	}

	public String toString() {
		// TODO Auto-generated method stub
		return "El futbolista "+nombre+" tiene "+edad+ ", y juega de "+posicion;
	}
	
	public boolean equals(Futbolista f) {
		if (this == f ) return true;
		else return false;
	}
	public abstract boolean jugarConLasManos();
	public int getEdad() {
		return edad;
	}public String getNombre() {
		return nombre;
	}public String getPosicion() {
		return posicion;
	}public void setEdad(int edad) {
		this.edad = edad;
	}public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
