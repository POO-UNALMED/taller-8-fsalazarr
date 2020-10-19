package futbol;

public class Portero extends Futbolista {
	public short golesRecibidos;
	public byte dorsal;
	public Portero(String nombre, int edad,short golesRecibidos,byte dorsal) {
		super(nombre, edad, "Portero");
		this.golesRecibidos = golesRecibidos;
		this.dorsal = dorsal;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "El futbolista "+getNombre()+" tiene "+getEdad()+ ", y juega de "+getPosicion()+" con el dorsal "+dorsal+ ". Le han marcado "+golesRecibidos;
	}
	@Override
	public int compareTo(Object p) {
		int x = ((Portero) p).golesRecibidos - this.golesRecibidos;
		return x;
	}
	public boolean jugarConLasManos() {
		return true;
	}
}
