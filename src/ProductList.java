import java.util.ArrayList;
import java.util.List;

public class ProductList {
    private List<Product> productsBucket = new ArrayList<>();

    public void addProduct(Product product) throws WrongFillingProductBucketException {
        if (checkProduct(product) != 0) {
            throw new WrongFillingProductBucketException("Такой товар уже есть в корзине!");
        } else {
            productsBucket.add(product);
        }
    }

    public void removeProduct(Product product) {
        if (checkProduct(product) != 0) {
            productsBucket.remove(checkProduct(product));
        }
    }

    private int checkProduct(Product product) {
        for (int i = 0; i < productsBucket.size(); i++) {
            if (productsBucket.get(i).equals(product)) {
                return i;
            }
        }
        return 0;
    }

    public List<Product> getProductsBucket() {
        return productsBucket;
    }

    @Override
    public String toString() {
        return "Список продуктов: " + productsBucket;
    }
}
