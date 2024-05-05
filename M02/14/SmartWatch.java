import java.util.ArrayList;

public class SmartWatch {
    // TODO: RECIBIR VARIABLES DE LA CONSOLA
    public static void main(String[] args) {
        ArrayList<Integer> arrayInt = new ArrayList<Integer>();

        arrayInt.add(300);
        arrayInt.add(405);
        arrayInt.add(403);
        arrayInt.add(506);
        arrayInt.add(100020040);
        arrayInt.add(45006);
        arrayInt.add(-1044);

        System.out.println("El promedio es " + promedio(clearSteps(arrayInt)));

    }

    public static ArrayList<Integer> clearSteps(ArrayList<Integer> arrayInt) {

        ArrayList<Integer> filtered = new ArrayList<Integer>();

        for (int e : arrayInt) {
            if (e > 199 && e < 100001) {
                filtered.add(e);
            }
        }

        return filtered;
    }

    public static Integer promedio(ArrayList<Integer> arrayInt) {
        Integer suma = 0;
        for (int e : arrayInt) {
            suma = suma + e;
        }

        return suma / arrayInt.size();
    }

}
