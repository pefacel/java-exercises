import java.util.ArrayList;

public class Visitas {
    // TODO: RECIBIR VARIABLES DE LA CONSOLA

    public static void main(String[] args) {
        ArrayList<Integer> arrayInt = new ArrayList<Integer>();

        arrayInt.add(3001);
        arrayInt.add(1402);
        arrayInt.add(1304);
        arrayInt.add(1505);

        System.out.println("Para la entrada anterior, el resultado es " + promedio(arrayInt));

    }

    public static Integer promedio(ArrayList<Integer> arrayInt) {
        Integer suma = 0;
        for (int e : arrayInt) {
            suma = suma + e;
        }

        return suma / arrayInt.size();
    }

}
