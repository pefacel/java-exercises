import java.util.ArrayList;

public class ProductService {
    private ArrayList<Product> productList = new ArrayList<Product>();

    public ArrayList<Product> getProductList() {
        return productList;
    }

    public void setProductList(ArrayList<Product> productList) {
        this.productList = productList;
    }

    public void printProductsList() {
        if (productList.size() == 0) {
            System.out.println("Sin productos");
        }

        for (Product product : productList) {
            System.out.println(product.toString());
        }
    }

    public void addProduct(Product product) {
        productList.add(product);
    }

    public void addProducts(ArrayList<Product> products) {
        for (Product product : products) {
            addProduct(product);
        }
    }

}
