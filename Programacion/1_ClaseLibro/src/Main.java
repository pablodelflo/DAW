
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Libro libro1 = new Libro();
		Libro libro2 = new Libro("12345678-9-1-12", "Mika Waltari", "Sinuhé el egipcio", 1956, "Planeta",256);
		
		System.out.println("==Este es mi primer libro==");
		System.out.println(libro1.toString());//Vacio porque en el constructor vacío no he puesto datos por defecto
		System.out.println("\n");
		System.out.println("==Este es mi segundo libro==");
		System.out.println(libro2.toString());//Relleno
	}

}