import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;

public class ExportTxt extends Exportator {
    ProductService productService = new ProductService();

    ArrayList<Product> products;

    public void existDirectory(String path) {
        File directory = new File(path);
        if (!directory.exists()) {
            throw new Error("El directorio no existe.");
        }
    }

    public void existFile(String path, String fileName) {
        File directory = new File(path + "/" + fileName);
        if (directory.exists()) {
            throw new Error("El archivo ya existe.");
        }
    }

    public void saveDateAndExport(ArrayList<Product> products) {
        this.products = products;
        export();
    }

    @Override
    public void export() {
        String path = "Ficheros";
        String fileName = "products";
        System.out.println(this.products);

        try {
            existDirectory(path);
            existFile(path, fileName);

            File directory = new File(path + "/" + fileName + ".txt");
            directory.createNewFile();
            FileWriter fileW = new FileWriter(path + "/" + fileName + ".txt");
            BufferedWriter bufferedWriter = new BufferedWriter(fileW);

            for (Product product : this.products) {

                bufferedWriter.write(product.toString());
                bufferedWriter.newLine(); 

            }
            bufferedWriter.close();
        } catch (Exception e) {
            System.out.println(e);
        }

    }

}
