package co.edu.uelbosque.model;

public class Municipio extends Departamento{
	private String nombre;
	private String nombreLugar;
	private String direccion;
	
	

	public Municipio(String nombreDepa, String nombre, String nombreLugar, String direccion) {
		super(nombreDepa);
		this.nombre = nombre;
		this.nombreLugar = nombreLugar;
		this.direccion = direccion;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the nombreLugar
	 */
	public String getNombreLugar() {
		return nombreLugar;
	}

	/**
	 * @param nombreLugar the nombreLugar to set
	 */
	public void setNombreLugar(String nombreLugar) {
		this.nombreLugar = nombreLugar;
	}

	/**
	 * @return the direccion
	 */
	public String getDireccion() {
		return direccion;
	}

	/**
	 * @param direccion the direccion to set
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	
	

}
