import java.util.Objects;

public class Product {

    private String name;
    private int price;
    private double requiredWeight;

    public Product(String name, int price, double requiredWeight) throws WrongDataFillingProductException {
        setName(name);
        setPrice(price);
        setRequiredWeight(requiredWeight);
    }

    public void setName(String name) throws WrongDataFillingProductException {
        if (name == null || name.isBlank()) {
            throw new WrongDataFillingProductException("Заполните карточку товара полностью!");
        } else {
            this.name = name;
        }
    }

    public void setPrice(int price) throws WrongDataFillingProductException {
        if (price == 0) {
            throw new WrongDataFillingProductException("Заполните карточку товара полностью!");
        } else {
            this.price = price;
        }
    }

    public void setRequiredWeight(double requiredWeight) throws WrongDataFillingProductException {
        if (requiredWeight == 0) {
            throw new WrongDataFillingProductException("Заполните карточку товара полностью!");
        } else {
            this.requiredWeight = requiredWeight;
        }
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public double getRequiredWeight() {
        return requiredWeight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return price == product.price && Double.compare(product.requiredWeight, requiredWeight) == 0 &&
                Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, requiredWeight);
    }

    @Override
    public String toString() {
        return (this.getName() + " " + this.getPrice() + " рублей");
    }
}
