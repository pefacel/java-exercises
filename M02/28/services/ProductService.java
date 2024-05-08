import java.util.ArrayList;
import java.util.Iterator;

public class ProductService {
    private ArrayList<Product> productList = new ArrayList<Product>();

    public ArrayList<Product> getProductList() {
        return productList;
    }

    public ArrayList<String> getProductListToExport() {
        ArrayList<String> productsToExport = new ArrayList<String>();
        Iterator<Product> iterator = productList.iterator();

        while (iterator.hasNext()) {
            productsToExport.add(iterator.next().toString());
        }
        return productsToExport;
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

    public void editProduct(Integer index, Product newProduct, Product oldProduct) {

        productList.add(index, newProduct);
        productList.remove(oldProduct);
    }

    public Integer productIndexByCode(String code) {

        Integer index = -1;

        for (int i = 0; i < productList.size(); i++) {
            Product product = productList.get(i);

            if (product.getCode().equals(code)) {
                index = i;
            }
        }
        System.out.println("index--> " + index);

        return index;
    }

    public Product getProductByIndex(Integer index) {
        return productList.get(index);
    }

    public void addProducts(ArrayList<Product> products) {
        for (Product product : products) {
            addProduct(product);
        }
    }

}
