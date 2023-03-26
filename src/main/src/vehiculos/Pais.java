package vehiculos;

public class Pais {
	private String nombre;
	private int numeroVendidos;

	public Pais(String nombre) {
		this.nombre = nombre;
		numeroVendidos++;
	}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
