import java.util.ArrayList;
import java.util.List;

public class Persona {

	private String nombre;
	private String rut;
	private String apellido;
	private List<CorreoElectronico> correosElectronicos;
	private List<Automovil> automoviles;


	public Persona(String nombre, String apellido, String rut){

		this.nombre = nombre;
		this.apellido = apellido;
		this.rut = rut;
		this.correosElectronicos = new ArrayList<>();
		this.automoviles = new ArrayList<>();


	}




	public String getNombre() {
		return this.nombre;
	}

	/**
	 * 
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido(){

		return this.apellido;
	}

	public void setApellido(){
		this.apellido = apellido;

	}

	public String getRut() {
		return this.rut;
	}

	/**
	 * 
	 * @param rut
	 */
	public void setRut(String rut) {
		this.rut = rut;
	}

	/**
	 * 
	 * @param nombre
	 * @param rut
	 */
	public Persona(String nombre, String rut) {
		// TODO - implement Persona.Persona
		throw new UnsupportedOperationException();
	}

	public List<CorreoElectronico> getCorreosElectronicos(){
		return this.correosElectronicos;

	}

	public void setCorreosElectronicos(){
		this.correosElectronicos = correosElectronicos;

	}


	public List<Automovil> getAutomoviles(){
		return this.automoviles;

	}

	public void setAutomoviles(){
		this.automoviles = automoviles;

	}

	public boolean automovilMarca(String marca){

		for(Automovil a : automoviles){
			if(a.getMarca().equals(marca)){
				return true;
			}
		}
		return false;
	}

	public void agregarAutomovil(Automovil automovil){
		automoviles.add(automovil);


	}

	public void agregarCorreo(CorreoElectronico correoElectronico){
		correosElectronicos.add(correoElectronico);


	}



}