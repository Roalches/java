package clase;

public class Customer implements IMyData {
	private String  rut;
	private String Name;
	
	public String getRut() {
		return rut;
	}
	public void setRut(String rut) {
		this.rut = rut;
	}
	public String getNombre() {
		return Name;
	}
	public void setNombre(String nombre) {
		this.Name = nombre;
	}
}
