import java.util.*;

public class Recipe {
    private String nameRecipe;

//  Переписал с HashSet на HashMap. Урок 2.9.
    private Map<Product, Integer> products = new HashMap<>();
    private int sumPriceOfRecipe = 0;

    public Recipe(String nameRecipe) {
        this.nameRecipe = nameRecipe;
    }

    public void addProductToRecipe(Product product) {
        if (product.getRequiredWeight() == 0) {
            products.put(product, 1);
        }
        products.put(product, (int) Math.floor(product.getRequiredWeight()));
    }

    public int getSumPriceOfRecipe() {
        sumPriceOfRecipe = 0;
        for (Map.Entry<Product, Integer> product : products.entrySet()) {
            sumPriceOfRecipe += product.getKey().getPrice() * product.getValue();
        }
        return sumPriceOfRecipe;
    }

    public String getNameRecipe() {
        return nameRecipe;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
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
