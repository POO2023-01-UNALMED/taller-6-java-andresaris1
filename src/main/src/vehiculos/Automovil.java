package vehiculos;

public class Automovil extends Vehiculo{
    private int puestos;
    private static int cantidadAutomoviles = 0;

    
    public Automovil(String placa, int puertas, int velocidadMaxima, String nombre, 
                     double precio, double peso, String traccion, Fabricante fabricante, int puestos) {
        super(placa, puertas, velocidadMaxima, nombre, precio, peso, traccion, fabricante);
        this.puestos = puestos;
    }
    
    public int getPuestos() {
        return puestos;
    }
    
    public void setPuestos(int puestos) {
        this.puestos = puestos;
    }
    
    public static int getCantidadAutomoviles() {
        return cantidadAutomoviles;
    }
}
