import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Recipe {
    private String nameRecipe;
    private Set<Product> products = new HashSet<>();
    private int sumPriceOfRecipe = 0;

    public Recipe(String nameRecipe) {
        this.nameRecipe = nameRecipe;
    }

    public void addProductToRecipe(Product product) {
        products.add(product);
    }

    public int getSumPriceOfRecipe() {
        sumPriceOfRecipe = 0;
        for (Product product : products) {
            sumPriceOfRecipe += product.getPrice();
        }
        return sumPriceOfRecipe;
    }

    public String getNameRecipe() {
        return nameRecipe;
    }

    @Override
    public boolean equals(Object o) {
        Recipe recipe = (Recipe) o;
        return recipe.getNameRecipe().equals(this.getNameRecipe());
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameRecipe);
    }

    @Override
    public String toString() {
        return "Рецепт " + nameRecipe;
    }
}
