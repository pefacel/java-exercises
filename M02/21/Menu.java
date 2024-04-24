
import java.util.Scanner;

public class Menu {

    static Scanner scanner = new Scanner(System.in);

    public Integer getOption() {
        Integer option = 0;

        Boolean isOptionValid = false;

        while (!isOptionValid) {
            showMenu();
            option = scanner.nextInt();

            if (option < 5 && option > 0) {
                isOptionValid = true;
            } else {
                System.out.println("Ingrese una opción válida del 1 al 4.");
            }
        }
        return option;
    }

    private void showMenu() {
        System.out.println();
        System.out.println("1 Listar Producto");
        System.out.println("2 Agregar Producto");
        System.out.println("3 Exportar Datos");
        System.out.println("4 Salir");
        System.out.println("Ingrese una opción:");
        System.out.println();

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