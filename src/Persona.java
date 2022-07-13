
public class Persona {
	
	private String dni;
	private String nombre;
	private int edad;
	private final char SEXO;
	private float peso;
	private float altura;
	
	
   public Persona(String dni) {
	    this.dni = dni;
		this.nombre = "";
		this.edad = 0;
		this.SEXO = 'M';
		this.peso = 0;
		this.altura = 0;
	   
   }

	public Persona(String dni, String nombre, int edad, char sexo) {
		this.dni = dni;
		this.nombre = nombre;
		this.edad = edad;
		this.SEXO = sexo;
		this.peso = 0;
		this.altura = 0;
	}
	
	public Persona(String dni, String nombre, int edad, char sexo, float peso, float altura) {
		this.dni = dni;
		this.nombre = nombre;
		this.edad = edad;
		this.SEXO = 'M';
		this.peso = peso;
		this.altura = altura;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public char getSEXO() {
		return SEXO;
	}
	
	
	
}
