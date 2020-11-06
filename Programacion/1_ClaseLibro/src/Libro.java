public class Libro {
	private String isbn;
	private String autor;
	private String titulo;
	private int anoPublicacion;
	private String editorial;
	private int numPaginas;
	
	//CONSTRUCTORES
	
	public Libro() {
		
	}
	
	public Libro(String isbn, String autor, String titulo, int anoPublicacion, String editorial, int numPaginas) {
		this.isbn = isbn;
		this.autor = autor;
		this.titulo = titulo;
		this.anoPublicacion = anoPublicacion;
		this.editorial = editorial;
		this.numPaginas = numPaginas;
	}
	
	//GETTERS & SETTERS
	//GETTERS
	public String getIsbn() {
		return isbn;
	}
	
	public String getAutor() {
		return autor;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public int getAnoPublicacion() {
		return anoPublicacion;
	}
	
	public String getEditorial() {
		return editorial;
	}
	
	public int getNumPaginas() {
		return numPaginas;
	}
	
	//SETTERS
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public void setAnoPublicacion(int anoPublicacion) {
		this.anoPublicacion = anoPublicacion;
	}
	
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}
	
	public void setNumPaginas(int numPaginas) {
		this.numPaginas = numPaginas;
	}
	
	//TOSTRING
	@Override
	public String toString() {
		return "Libro [isbn=" + isbn + ", autor=" + autor + ", titulo=" + titulo + ", anoPublicacion=" + anoPublicacion
				+ ", editorial=" + editorial + ", numPaginas=" + numPaginas + "]";
	}
	
}
