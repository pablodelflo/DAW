
public class Coche extends Vehiculo {
	private int cilindrada;
	
	public Coche() {
		
	}
	
	public Coche(int cilindrada) {
		super();
		this.cilindrada = cilindrada;
	}

	public int getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}
	
}
