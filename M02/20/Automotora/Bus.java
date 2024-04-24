package Automotora;

public class Bus extends Vehiculo {

    private Integer cantidadDeAsientos;

    public Bus(String color, String patente, Integer cantidadDeAsientos) {
        super(color, patente);
        this.cantidadDeAsientos = cantidadDeAsientos;
    }

    public void setCantidadDeAsientos(Integer cantidadDeAsientos) {
        this.cantidadDeAsientos = cantidadDeAsientos;
    }

    public Integer asientosDisponibles() {
        return this.cantidadDeAsientos;
    }

}
