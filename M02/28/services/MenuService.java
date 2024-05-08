
import java.util.Scanner;

public class MenuService {

    static Scanner scanner = new Scanner(System.in);

    public Integer getOption() {
        Integer option = 0;

        Boolean isOptionValid = false;

        while (!isOptionValid) {
            showMenu();
            option = scanner.nextInt();

            if (option < 7 && option > 0) {
                isOptionValid = true;
            } else {
                System.out.println("Ingrese una opción válida del 1 al 5.");
            }
        }
        return option;
    }

    private void showMenu() {
        System.out.println();
        System.out.println("1 Listar Producto");
        System.out.println("2 Agregar Producto");
        System.out.println("3 Exportar Datos");
        System.out.println("4 Importar Datos");
        System.out.println("5 Editar Datos");

        System.out.println("6 Salir");
        System.out.println("Ingrese una opción:");
        System.out.println();

    }

    public Integer editProductMenuOption() {
        System.out.println("Editar Producto");
        System.out.println("Ingrese el número 1 para editar los datos ingresados del Producto");

        return scanner.nextInt();
    }

    public String productCodeToEdit() {
        System.out.println("Ingrese código del producto:");
        return scanner.nextLine();
    }

    public String printProductToEdit(Product product) {

        System.out.println("1.-El nombre del articulo actual es: " + product.getArticle());
        System.out.println("2.-El código del producto: " + product.getCode());
        System.out.println("3.-El color del producto:" + product.getColor());
        System.out.println(
                "4.-La descripción del producto: Es un Jean muy lindo con hermosos detalles "
                        + product.getDescription());
        System.out.println(" 5.-La marca del producto: " + product.getBrand());
        System.out.println("6.-El precio del producto: " + product.getPrice());
        System.out.println("7.-La talla del producto:" + product.getSize());

        return scanner.nextLine();
    }

    public Product editProduct(Product product, Integer option) {
        Product editedProduct = new Product(product.getArticle(), product.getPrice(), product.getDescription(),
        product.getCode(), product.getSize(), product.getBrand(), product.getColor());
        String toEdit;

        switch (option) {
            case 1:
                System.out.println("1.-El nombre del articulo actual será: ");
                toEdit = scanner.nextLine();
                editedProduct.setArticle(toEdit);
                break;
            case 2:
                System.out.println("2.-El código del producto será: ");
                toEdit = scanner.nextLine();
                editedProduct.setCode(toEdit); 
                break;
            case 3:
                System.out.println("3.-El color del producto será: ");
                toEdit = scanner.nextLine();
                editedProduct.setColor(toEdit);
                break;
            case 4:
                System.out.println("4.-La Descripción del producto actual será: ");
                toEdit = scanner.nextLine();
                editedProduct.setDescription(toEdit);
                break;
            case 5:
                System.out.println("5.-La marca del producto actual será: ");
                toEdit = scanner.nextLine();
                editedProduct.setBrand(toEdit);
                break;
            case 6:
                System.out.println("6.-El precio del producto actual será: ");
                toEdit = scanner.nextLine();
                editedProduct.setArticle(toEdit);
                break;
            case 7:
                System.out.println("7.- La talla del producto será: ");
                toEdit = scanner.nextLine();
                editedProduct.setSize(toEdit);
                break;

            default:
                break;
        }

        return editedProduct;
    }

    public Product getProducFromPrompt() {
        scanner.nextLine();
        System.out.println("Ingresar nombre articulo:");
        String article = scanner.nextLine();
        System.out.println("Ingresa precio:");
        String price = scanner.nextLine();
        System.out.println("Ingresa descripción:");
        String description = scanner.nextLine();
        System.out.println("Ingresa código:");
        String code = scanner.nextLine();
        System.out.println("Ingresa talla:");
        String size = scanner.nextLine();
        System.out.println("Ingresa marca:");
        String brand = scanner.nextLine();
        System.out.println("Ingresa color:");
        String color = scanner.nextLine();
        Product product = new Product(article, price, description, code, size, brand, color);
        return product;
    }

}