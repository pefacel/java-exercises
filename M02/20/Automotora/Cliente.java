package Automotora;

public class Cliente extends Persona {

    private Integer edad;

    public Cliente(String rut, String nombre, Integer edad) {
        super(rut, nombre);
        this.edad = edad;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

}
