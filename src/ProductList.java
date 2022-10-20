import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ProductList {
    private Set<Product> productsBucket = new HashSet<>();

    public void addProduct(Product product) throws WrongFillingProductBucketException {
        if (productsBucket.contains(product)) {
            throw new WrongFillingProductBucketException("Такой товар уже есть в корзине!");
        } else {
            productsBucket.add(product);
        }
    }

    public void removeProduct(Product product) {
        productsBucket.remove(product);
    }

//    private Product checkProduct(Product product) {
//        for (int i = 0; i < productsBucket.size(); i++) {
//            if (productsBucket.contains(product)) {
//                return product;
//            }
//        }
//        return null;
//    }

    public Set<Product> getProductsBucket() {
        return productsBucket;
    }

    @Override
    public String toString() {
        return "Список продуктов: " + productsBucket;
    }
}
