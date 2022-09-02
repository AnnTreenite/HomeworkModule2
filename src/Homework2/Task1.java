package Homework2;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.stream.Collectors;

public class Task1 {
    public static void main(String[] args) {
        List<Integer> integers = List.of(1,2,3,4,5,5,8,8,9);
        Random random = new Random(1);
        Integer integerUser = integers.stream()
                .filter(e -> e >= 4)
                .distinct()
                .map(e -> new User(e))
                .peek(e -> e.setNumbers(new Random().ints(0, 10)
                        .limit(e.getNumber()).boxed().collect(Collectors.toList())))
                .flatMap(e -> e.getNumbers().stream())
                .map(e -> e * 10)
                .reduce(Integer::sum)
                .orElse(0);
        System.out.println(integerUser);

        List<List<Integer>> lists = List.of(List.of(1, 2), List.of(3, 4, 5), List.of());
        List<List<Integer>> lists1 = lists.stream()
                .sorted(Comparator.<List<Integer>>comparingInt(List::size).reversed())
                .collect(Collectors.toList());
        System.out.println(lists1);

        List<Integer> integers1 = lists.stream()
                .filter(x -> x.stream().reduce(Integer::sum).orElse(0) == 12)
                .findFirst()
                .orElse(null);
        System.out.println(integers1);
    }
}
