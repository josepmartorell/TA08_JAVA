
public class Serie {
	
	private String titulo;
	private int numTemporada;
	private boolean entregado;
	private String genero;
	private String creador;
	
	public Serie() {
		this.titulo = "Los Juegos Del Hambre";
		this.numTemporada = 3;
		this.entregado = false;
		this.genero = "Ciencia Ficción";
		this.creador = "Suzanne Collins";
	}

	public Serie(String titulo, String creador) {
		super();
		this.titulo = titulo;
		this.numTemporada = 3;
		this.entregado = false;
		this.genero = "Ciencia Ficción";
		this.creador = creador;
	}

	public Serie(String titulo, int numTemporada, String genero, String creador) {
		super();
		this.titulo = titulo;
		this.numTemporada = numTemporada;
		this.entregado = false;
		this.genero = genero;
		this.creador = creador;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getNumTemporada() {
		return numTemporada;
	}

	public void setNumTemporada(int numTemporada) {
		this.numTemporada = numTemporada;
	}

	public boolean isEntregado() {
		return entregado;
	}

	public void setEntregado(boolean entregado) {
		this.entregado = entregado;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCreador() {
		return creador;
	}

	public void setCreador(String creador) {
		this.creador = creador;
	}

	
}
