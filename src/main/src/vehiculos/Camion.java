package vehiculos;

public class Camion extends Vehiculo{
    private int ejes;
    private static int cantidadCamiones = 0;
    
    public Camion(String placa, int puertas, int velocidadMaxima, String nombre, double precio, double peso, String traccion, Fabricante fabricante, int ejes) {
        super(placa, puertas, velocidadMaxima, nombre, precio, peso, traccion, fabricante);
        this.ejes = ejes;
    }

    public int getEjes() {
        return ejes;
    }

    public void setEjes(int ejes) {
        this.ejes = ejes;
    }
    
    public static int getCantidadCamiones() {
        return cantidadCamiones;
    }
}
