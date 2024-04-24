package Automotora;

public class MiniBus extends Bus {

    private String tipoDeViaje;

    public MiniBus(String color, String patente, Integer cantidadDeAsientos, String tipoDeViaje) {
        super(color, patente, cantidadDeAsientos);
        this.tipoDeViaje = tipoDeViaje;
    }

    public String getTipoDeViaje() {
        return tipoDeViaje;
    }

    public void setTipoDeViaje(String tipoDeViaje) {
        this.tipoDeViaje = tipoDeViaje;
    }

    public void imprimeBus() {
        System.out.println("Color: " + getColor());
        System.out.println("Patente: " + getPatente());
        System.out.println("Tipo de Viaje: " + getTipoDeViaje());
        System.out.println("Asientos: " + asientosDisponibles());
    }

}
