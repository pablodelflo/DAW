/*
 * HACER UNA CLASE DE LIBRO, CON UNA SERIE DE ATRIBUTOS (ISBN, AUTOR, NOMBRE, A�O PUBLICACION, EDITORIAL, NUMERO DE P�GINAS
 */
import java.util.Scanner; //Importamos scanner para el 1B
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Libro libro1 = new Libro();
		Libro libro2 = new Libro("12345678-9-1-12", "Mika Waltari", "Sinuh� el egipcio", 1956, "Planeta",256);
		
		System.out.println("==Este es mi primer libro==");
		System.out.println(libro1.toString());//Vacio porque en el constructor vac�o no he puesto datos por defecto
		System.out.println("\n");
		System.out.println("==Este es mi segundo libro==");
		System.out.println(libro2.toString());//Relleno
		
		//EJERCICIO 1B -> Solicitar los datos de un nuevo libro por teclado al usuario
		Scanner teclado = new Scanner(System.in);
		String isbn,autor,titulo,editorial;
		int anoPublicacion,numPaginas;
		
		System.out.println("\n");
		System.out.println("Datos del libro 3");
		
		System.out.println("Introduce el ISBN: ");
		isbn = teclado.nextLine();
		System.out.println("Introduce el autor: ");
		autor = teclado.nextLine();
		System.out.println("Introduce el t�tulo: ");
		titulo = teclado.nextLine();
		System.out.println("Introduce el a�o de publicaci�n: ");
		anoPublicacion = teclado.nextInt();
		teclado.nextLine();
		System.out.println("Introduce la editorial: ");
		editorial = teclado.nextLine();
		System.out.println("Introduce el n�mero de p�ginas: ");
		numPaginas = teclado.nextInt();
		teclado.nextLine();
		
		Libro libro3 = new Libro(isbn,autor,titulo,anoPublicacion,editorial,numPaginas);
		
		System.out.println("==Este es mi tercer libro==");
		System.out.println(libro3.toString());
		
	}

}