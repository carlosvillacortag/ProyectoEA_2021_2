package clases;

public class Retiro{
	
	//atributos
	private int numRetiro; //correlativo 200001
	private int numMatricula;
	private String fecha; // formato dd/mm/aaaa
	private String hora; // fomrato hh:mm:ss
	
	//constructor
	public Retiro(int numRetiro, int numMatricula, String fecha, String hora) {
		super();
		this.numRetiro = numRetiro;
		this.numMatricula = numMatricula;
		this.fecha = fecha;
		this.hora = hora;
	}

	
	//metodos set y get
	public int getNumRetiro() {
		return numRetiro;
	}

	public void setNumRetiro(int numRetiro) {
		this.numRetiro = numRetiro;
	}

	public int getNumMatricula() {
		return numMatricula;
	}

	public void setNumMatricula(int numMatricula) {
		this.numMatricula = numMatricula;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}
	
	
	
}