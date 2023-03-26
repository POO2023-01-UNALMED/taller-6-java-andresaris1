package vehiculos;

public class Fabricante {
	private String nombre;
    private Pais pais;
    private int numeroVendidos;

    public Fabricante(String nombre, Pais pais) {
        this.nombre = nombre;
        this.pais = pais;
        numeroVendidos++;
    }
    
    
    public int getNumeroVendidos() {
    	return numeroVendidos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }
}
