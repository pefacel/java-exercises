import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // ExportTxt exportTxt = new ExportTxt();
        FileService fileService = new FileService();

        String directoryPath = "directories";
        String fileName = "text.txt";
        ProductService productService = new ProductService();

        Product jean = new Product("Jean", "112", "Jeans azules", "001", "xl", "Lewis", "Azul");
        productService.addProduct(jean);

        MenuService menuService = new MenuService();
        UtilService utilService = new UtilService();

        Integer option = 0;

        while (option != 6) {
            try {
                option = menuService.getOption();

                switch (option) {

                    case 1:
                        utilService.sleepTimer(10);
                        productService.printProductsList();
                        break;
                    case 2:
                        utilService.sleepTimer(10);
                        Product product;
                        product = menuService.getProducFromPrompt();
                        productService.addProduct(product);
                        break;
                    case 3:
                        utilService.sleepTimer(10);

                        if (!fileService.existDirectory(directoryPath)) {
                            System.out.println("El directorio no existe. Creando directorio.");
                            fileService.createDirectory(directoryPath);
                        }
                        if (fileService.existFile(directoryPath, fileName)) {
                            fileService.createNewFile(directoryPath, fileName);
                        }

                        ArrayList<String> productsToExports = productService.getProductListToExport();

                        System.out.println(productsToExports.toString());

                        try {
                            fileService.writeListInFile(directoryPath, fileName, productsToExports);

                        } catch (Exception e) {
                            System.err.println(e);
                        }
                        System.out.println("Datos cargados correctamente en la lista");

                        break;
                    case 4:
                        System.out.println("Cargando datos.");
                        utilService.sleepTimer(10);
                        ArrayList<Product> newProducts = fileService.loadProductData(directoryPath, fileName);
                        productService.addProducts(newProducts);

                        break;

                    case 5:

                        Boolean isProductReady = false;
                        System.out.println("Buscando producto.");
                        utilService.sleepTimer(10);

                        Integer optionEdit = menuService.editProductMenuOption();
                        System.out.println(optionEdit);

                        if (optionEdit != 1) {
                            break;
                        }

                        System.out.println("Ingrese código del producto:");

                        String code = scanner.nextLine();
                        utilService.sleepTimer(10);

                        Integer index = productService.productIndexByCode(code);

                        Product productToEdit = productService.getProductByIndex(index);
                        System.out.println(productToEdit.toString());

                        menuService.printProductToEdit(productToEdit);

                        System.out.println("Ingrese la opción a editar de los datos del producto:");

                        Integer optionToEdit = scanner.nextInt();

                        Product newProduct;

                        newProduct = menuService.editProduct(productToEdit, optionToEdit);

                        productService.editProduct(index, newProduct, productToEdit);
                        break;

                    case 6:
                        System.out.println("Abandonando el sistema de clientes...");
                        System.out.println("Acaba de salir del sistema.");
                        System.exit(0);
                    default:
                        break;
                }

            } catch (Exception e) {
                System.out.println("La opción ingresada no es un número.");
                break;
            }
        }

    }
}
