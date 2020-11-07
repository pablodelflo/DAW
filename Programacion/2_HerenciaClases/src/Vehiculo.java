
public class Vehiculo {
	//Atributos
	private String color;
	private String numeroSerie;
	
	//Constructores
	public Vehiculo() {
		
	}
	
	public Vehiculo(String color,String numeroSerie) {
		this.color = color;
		this.numeroSerie = numeroSerie;
	}
	
	//Getters & Setters
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getNumeroSerie() {
		return numeroSerie;
	}

	public void setNumeroSerie(String numeroSerie) {
		this.numeroSerie = numeroSerie;
	}
}
