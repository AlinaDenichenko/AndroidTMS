import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Map<Boolean, Long> count = IntStream.iterate(0, i -> i + 1)
                .limit(40)
                .boxed()
                .collect(Collectors.groupingBy(
                        num -> num % 2 == 0,
                        Collectors.counting()
                ));

        Map<Boolean, Long> sum = IntStream.iterate(0, i -> i + 1)
                .limit(40)
                .boxed()
                .collect(Collectors.groupingBy(
                        num -> num % 2 == 0,
                        Collectors.summingLong(num -> num)
                ));

        Map<Type, Long> countNumbers = new HashMap<>();
        countNumbers.put(Type.EVEN, count.get(true));
        countNumbers.put(Type.ODD, count.get(false));

        Map<Type, Long> sumNumbers = new HashMap<>();
        sumNumbers.put(Type.EVEN, sum.get(true));
        sumNumbers.put(Type.ODD, sum.get(false));

        System.out.println("Количество четных и нечетных: " + countNumbers);
        System.out.println("Сумма четных и нечетных: " + sumNumbers);
    }
}