import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class FileService {

    public Boolean isCorrectFileExtension(String fileName, String suffix) {
        return fileName.endsWith(suffix);
    }

    public Boolean existDirectory(String directoryPath) {
        File directory = new File(directoryPath);
        return directory.exists();
    }

    public Boolean existFile(String directoryPath, String fileName) {
        File file = new File(directoryPath + "/" + fileName);
        return file.exists();
    }

    public void createNewFile(String directoryPath, String fileName) {
        File directory = new File(directoryPath + "/" + fileName);
        try {
            directory.createNewFile();
        } catch (Exception e) {
            System.out.println("El archivo ya existe.");
            System.exit(0);
        }
    }

    public void createDirectory(String directoryPath) {
        File directory = new File(directoryPath);
        directory.mkdirs();
    }

    public void writeListInFile(String directoryPath, String fileName, ArrayList<String> list) {
        File file = new File(directoryPath + "/" + fileName);

        try {
            FileWriter fileWriter = new FileWriter(file);

            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            Iterator<String> iterator = list.iterator();

            while (iterator.hasNext()) {

                bufferedWriter.write(iterator.next());
                if (iterator.hasNext()) {
                    bufferedWriter.newLine();
                }
            }

            bufferedWriter.close();
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error." + e);

        }

    }

    public Integer searchFrequencyText(String directoryPath, String fileName, String textToSearch) {

        Integer count = 0;

        if (!existFile(directoryPath, fileName)) {
            throw new Error("El fichero no existe.");
        }

        try {
            File file = new File(directoryPath + "/" + fileName);
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = bufferedReader.readLine();

            while (line != null) {

                if (line.equals(textToSearch)) {
                    count++;
                }

                line = bufferedReader.readLine();
            }

            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return count;
    }

}