package Automotora;

import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        try {

            Cliente cliente = new Cliente("18123456-5", "Pedro", 30);
            Vehiculo vehiculo = new Vehiculo("Rojo", "56cfgr");

            LibroVenta libroVenta = new LibroVenta(cliente, vehiculo, "venta 1");
            libroVenta.guardarVenta();
        } catch (Exception e) {
            System.out.println(e);
        }

    }

}