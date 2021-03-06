package futbol;

public class Jugador extends Futbolista {
	public short golesMarcados;
	public byte dorsal;
	public Jugador(String nombre, int edad, String posicion,short golesMarcados,byte dorsal) {
		super(nombre, edad, posicion);
		this.golesMarcados = golesMarcados;
		this.dorsal = dorsal;
	}
	public Jugador() {
		super();
		this.golesMarcados = 289;
		this.dorsal = 7;
	}
	@Override
	public int compareTo(Object j) {
		int x = this.getEdad() - ((Jugador) j).getEdad();
		return x;
	}
	
	public boolean jugarConLasManos() {
		return false;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "El futbolista "+getNombre()+" tiene "+getEdad()+ ", y juega de "+getPosicion()+" con el dorsal "+dorsal+ ". Ha marcado "+golesMarcados;
	}
}