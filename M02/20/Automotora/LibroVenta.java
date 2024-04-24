package Automotora;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Date;

public class LibroVenta {

    private Cliente cliente;
    private Vehiculo vehiculo;

    private String nombreVenta;
    private String fechaVenta;

    public String getNombreVenta() {
        return nombreVenta;
    }

    public void setNombreVenta(String nombreVenta) {
        this.nombreVenta = nombreVenta;
    }

    public String getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(String fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public LibroVenta(Cliente cliente, Vehiculo vehiculo, String nombreVenta) {
        this.cliente = cliente;
        this.vehiculo = vehiculo;
        this.nombreVenta = nombreVenta;

        Number today = new Date().getTime();

        this.fechaVenta = today.toString();

    }

    public static void existeDirectorio(String path) {
        File directorio = new File(path);
        if (!directorio.exists()) {
            throw new Error("El directorio no existe.");
        }
    }

    public static void existeArchivo(String path, String nombreArchivo) {
        File directorio = new File(path + "/" + nombreArchivo);
        if (directorio.exists()) {
            throw new Error("El archivo ya existe.");
        }
    }

    public void guardarVenta() {
        String path = "Ficheros";
        String nombreArchivo = nombreVenta;
        String textoAGuardar = "Patente: " + vehiculo.getPatente() + " Edad: " + cliente.getEdad() + " Fecha: "
                + fechaVenta + " Nombre venta: " + nombreVenta;
        System.out.println(textoAGuardar);
        try {
            existeDirectorio(path);
            existeArchivo(path, nombreArchivo);
            File directorio = new File(path + "/" + nombreArchivo + ".txt");
            directorio.createNewFile();
            FileWriter fileW = new FileWriter(path + "/" + nombreArchivo + ".txt");
            BufferedWriter bufferedWriter = new BufferedWriter(fileW);
            bufferedWriter.write(textoAGuardar);
            bufferedWriter.close();
        } catch (Exception e) {
            System.out.println(e);
        }

    }

}
