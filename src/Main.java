import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws WrongDataFillingProductException,
            WrongFillingProductBucketException {

        Product bread = new Product("Хлеб", 50, 0.5);
        Product butter = new Product("Масло", 120, 0.2);
        Product sausage = new Product("Колбаса", 450, 1);
        Product milk = new Product("Молоко", 75, 0.9);

        ProductList productsBucket = new ProductList();
        productsBucket.addProduct(bread);
        productsBucket.addProduct(butter);
        productsBucket.addProduct(sausage);
        productsBucket.addProduct(milk);

        System.out.println(productsBucket);

        System.out.println("После удаления продукта - " + butter.getName());
        productsBucket.removeProduct(butter);
        System.out.println(productsBucket);

    }
}