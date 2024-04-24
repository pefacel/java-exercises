package Automotora;

public class Taxi extends Vehiculo {

    private Integer valorPasaje;

    public Taxi(String color, String patente, Integer valorPasaje) {
        super(color, patente);
        this.valorPasaje = valorPasaje;
    }

    public void setValorPasaje(Integer valorPasaje) {
        this.valorPasaje = valorPasaje;
    }

    public Integer pagarPasaje(Integer pasaje) {

        if (pasaje > valorPasaje) {
            return valorPasaje - pasaje;
        } else {
            return valorPasaje;
        }

    }

    // public Integer getValorPasaje() {
    // return valorPasaje;
    // }

    public Integer valorPasaje() {
        return this.valorPasaje;
    }

}
