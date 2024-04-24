public class Product {

    private String article;
    private String price;
    private String description;
    private String code;
    private String size;
    private String brand;
    private String color;

    public Product(String article, String price, String description, String code, String size, String brand,
            String color) {
        this.article = article;
        this.price = price;
        this.description = description;
        this.code = code;
        this.size = size;
        this.brand = brand;
        this.color = color;
    }

    public String getArticle() {
        return article;
    }

    public void setArticle(String article) {
        this.article = article;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Product [article=" + article + ", price=" + price + ", description=" + description + ", code=" + code
                + ", size=" + size + ", brand=" + brand + ", color=" + color + "]";
    }

    

}
