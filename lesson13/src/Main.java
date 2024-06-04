import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Shop> shops = List.of(
                new Shop(138, "Linkin Street 89", "New York", "123456789"),
                new Shop(495, "Nickelback Street 11", "Hanna", "987654321"),
                new Shop(289, "Offspring Street 23", "New York", "123765895")
        );
        List<Producer> producers = List.of(
                new Producer("Ozon", "Russia"),
                new Producer("Wildberries", "Japan")
        );
        List<Product> products = List.of(
                new Product("Ice Cream", 1, Category.FOOD, true, List.of(shops.get(0), shops.get(1)), producers.get(0)),
                new Product("Phone", 199, Category.TECHNOLOGY, true, List.of(shops.get(1), shops.get(2)), producers.get(1)),
                new Product("Hammer", 35, Category.REPAIR, false, List.of(shops.get(0), shops.get(2)), producers.get(0)),
                new Product("Fish", 2, Category.FOOD, true, List.of(shops.get(2)), producers.get(1))
        );

        List<Product> sortedProducts = products.stream().sorted(Comparator.comparing(Product::getPrice)).toList();

        System.out.println("Cheap product: " + sortedProducts.get(0).getName());
        System.out.println("Expensive product: " + sortedProducts.get(products.size() - 1).getName());

        System.out.println("Delivery is possible: " + products.stream()
                .filter(Product::isDelivery)
                .map(Product::getName)
                .toList()
        );

        System.out.println("Average price of food: " + products.stream()
                .filter(product -> product.getCategory() == Category.FOOD)
                .mapToInt(Product::getPrice)
                .average()
        );

        System.out.println("All products of Ozon: " + products.stream()
                .filter(product -> Objects.equals(product.getProducer().getName(), "Ozon"))
                .map(Product::getName)
                .toList()
        );

        System.out.println("All producers of Russia: " + products.stream()
                .map(Product::getProducer)
                .filter(producer -> Objects.equals(producer.getCountry(), "Russia"))
                .map(Producer::getName)
                .collect(Collectors.toSet())
        );

        System.out.println("All shops of New York: " + products.stream()
                .flatMap(product -> product.getShops().stream())
                .filter(shop -> Objects.equals(shop.getCity(), "New York"))
                .collect(Collectors.toSet())
        );

        System.out.println("Address of shop of phone number 123456789: " + products.stream()
                .flatMap(product -> product.getShops().stream())
                .filter(shop -> Objects.equals(shop.getPhone(), "123456789"))
                .map(Shop::getAddress)
                .collect(Collectors.toSet())
        );

        Shop shop138 = products.stream()
                .flatMap(product -> product.getShops().stream())
                .filter(shop -> shop.getNumber() == 138)
                .toList()
                .get(0);

        System.out.println("All products of shop #138: " + products.stream()
                .filter(product -> {
                            for (Shop shop : product.getShops()) {
                                if (shop == shop138) {
                                    return true;
                                }
                            }
                            return false;
                        }
                )
                .map(Product::getName)
                .toList());

        System.out.println(shops.stream()
                .collect(Collectors.toMap(Shop::getNumber, Shop::getPhone))
        );

        long countOfAllProductsOfFood = products.stream()
                .filter(product -> Objects.equals(product.getCategory(), Category.FOOD))
                .count();

        long countOfProductsAreDelivery = products.stream()
                .filter(product -> Objects.equals(product.getCategory(), Category.FOOD))
                .filter(Product::isDelivery)
                .count();

        if (countOfAllProductsOfFood == countOfProductsAreDelivery) {
            System.out.println("All food's products can be delivery");
        } else {
            System.out.println("Not all food's products can be delivery");
        }

        System.out.println("Count of shop: " + products.stream()
                .flatMap(product -> product.getShops().stream())
                .collect(Collectors.toSet()).size()
        );

        System.out.println("Sort of products: " + products.stream()
                .sorted(Comparator.comparing(Product::getPrice))
                .map(Product::getName)
                .toList()
        );

        System.out.println(IntStream.iterate(0, i -> i + 1)
                .limit(10)
                .average()
        );

        IntStream.iterate(0, i -> i + 1)
                .skip(5)
                .filter(v -> v % 3 == 0)
                .limit(10)
                .forEach(v -> System.out.print(v + " "));

        System.out.println();

        System.out.println(IntStream.iterate(0, i -> i + 1)
                .limit(20)
                .sum()
        );
    }
}