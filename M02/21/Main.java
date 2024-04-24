
public class Main {
    public static void main(String[] args) {
        ExportTxt exportTxt = new ExportTxt();
        ProductService productService = new ProductService();
        Product jean = new Product("Jean", "112", "Jeans azules", "001", "xl", "Lewis", "Azul");
        productService.addProduct(jean);

        Menu menu = new Menu();
        Util util = new Util();

        Integer option = 0;

        while (option != 4) {
            try {
                option = menu.getOption();

                switch (option) {
                    case 4:
                        System.exit(0);
                    case 1:
                        util.sleepTimer(100);
                        productService.printProductsList();
                    case 2:
                        Product product;
                        product = menu.getProducFromPrompt();
                        productService.addProduct(product);
                    case 3:
                        util.sleepTimer(100);
                        exportTxt.saveDateAndExport(productService.getProductList());
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
