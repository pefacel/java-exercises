import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        FileService fileService = new FileService();

        String directoryPath = "directories";
        String fileName = "text.txt";

        ArrayList<String> list = new ArrayList<String>();
        list.add("Perro");
        list.add("Gato");
        list.add("Juan");
        list.add("Daniel");
        list.add("Juan");
        list.add("Gato");
        list.add("Perro");
        list.add("Camila");
        list.add("Daniel");
        list.add("Camila");

        if (!fileService.isCorrectFileExtension(fileName, ".txt")) {
            System.out.println("La extensión del archivo está equivocada. Por favor, revise que el suffix sea .txt");
            System.exit(0);
        }
        try {
            if (!fileService.existDirectory(directoryPath)) {
                System.out.println("El directorio no existe. Creando directorio.");
                fileService.createDirectory(directoryPath);
            } else {
                System.out.println("Acceso al directorio llevado correctamente.");
            }
        } catch (Exception e) {
            System.err.println("Error al crear directorio.");
        }

        if (fileService.existFile(directoryPath, fileName)) {
            fileService.createNewFile(directoryPath, fileName);
        }

        fileService.writeListInFile(directoryPath, fileName, list);

        Integer frequencyText = fileService.searchFrequencyText(directoryPath, fileName, "Perro");

        System.out.println("cantidad de repeticiones del texto -> " + frequencyText);

    }
}
