package vehiculos;

public class Camioneta extends Vehiculo {
    private boolean volco;
    private static int cantidadCamionetas = 0;

    public Camioneta(String placa, int puertas, double precio, double peso, String traccion, Fabricante fabricante, boolean volco) {
        super(placa, 4, 90, "Camioneta", precio, peso, traccion, fabricante);
        this.volco = volco;
        cantidadCamionetas++;
    }

    public boolean isVolco() {
        return volco;
    }

    public void setVolco(boolean volco) {
        this.volco = volco;
    }

    public static int getCantidadCamionetas() {
        return cantidadCamionetas;
    }
}
