import java.util.*;

public class Main {
    public static void main(String[] args) throws WrongDataFillingProductException,
            WrongFillingProductBucketException, Exception {
        part1();
        part2();
        part3();
        part4();
        part5();
    }

    public static void part1() throws WrongDataFillingProductException,
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
//        productsBucket.addProduct(milk);

        System.out.println(productsBucket);

        System.out.println("После удаления продукта - " + butter.getName());
        productsBucket.removeProduct(butter);
        System.out.println(productsBucket);
    }

    public static void part2() throws Exception {
//        Пришлось поменять поля Product для работы с мапами.
        Product bread = new Product("Хлеб", 50, 1.3);
        Product butter = new Product("Масло", 120, 2.2);
        Product sausage = new Product("Колбаса", 450, 1);
        Product milk = new Product("Молоко", 75, 0.9);
        Product eggs = new Product("Яйца", 85, 4.4);

        Recipe sandwich = new Recipe("Бутерброд");
        sandwich.addProductToRecipe(bread);
        sandwich.addProductToRecipe(butter);
        System.out.printf("Стоимость %s - %d рублей. \n", sandwich.getNameRecipe(), sandwich.getSumPriceOfRecipe());

        Recipe omelet = new Recipe("Яичница");
        omelet.addProductToRecipe(eggs);
        omelet.addProductToRecipe(milk);
        System.out.printf("Стоимость %s - %d рублей. \n", omelet.getNameRecipe(), omelet.getSumPriceOfRecipe());

        Recipe breadButterSausage = new Recipe("Бутерброд");
        breadButterSausage.addProductToRecipe(bread);
        breadButterSausage.addProductToRecipe(butter);
        breadButterSausage.addProductToRecipe(sausage);

        Set<Recipe> recipes = new HashSet<>();
        recipes.add(sandwich);
        recipes.add(omelet);
        recipes.add(breadButterSausage);
        System.out.println(recipes);
    }

    public static void part3() {
        List<Integer> randomList = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            int random = (int) (Math.random() * 1000);
            randomList.add(i, Integer.valueOf(random));
        }
        System.out.println("Объявлен массив: " + randomList);

        Iterator<Integer> numbers = randomList.listIterator();
        while (numbers.hasNext()) {
            if (numbers.next() % 2 != 0) {
                numbers.remove();
            }
        }

        System.out.print("Массив после удаления нечетных чисел: " + randomList);
    }


    public static void part4() {
        Set<Task> tasks = new HashSet<>(15);
        int count = 0;
//        Почему я не могу на 82 строке вместо числа 15 написать tasks.size() - я же указал его размер на 79 строке?
        while (count < 15) {
            tasks.add(new Task());
            count++;
        }

        System.out.println(tasks);
    }

    public static void part5() throws Exception {
        Passport ivan = new Passport("111", "Ivanov", "Иван", "Иванович", "11.01.91");
        Passport pavel = new Passport("112", "Павлов", "Павел", "22.02.92");
        Passport alexander = new Passport("113", "Александров", "Александр", "30.03.93");
        Passport alice = new Passport("111", "Алисова", "Алиса", "04.04.94");

        Map<String, Passport> pasports = new HashMap<>();
        pasports.put(ivan.getId(), ivan);
        pasports.put(pavel.getId(), pavel);
        pasports.put(alexander.getId(), alexander);
        System.out.println(pasports);

        pasports.put(alice.getId(), alice);
        System.out.println(pasports);

        System.out.println(pasports.get("114"));
        System.out.println(pasports.get("112"));

    }
}