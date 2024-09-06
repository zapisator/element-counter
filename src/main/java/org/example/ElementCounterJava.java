package org.example;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ElementCounterJava {
    private ElementCounterJava() {
    }

    public static <T> Map<T, Long> countElements(List<T> list) {
        return list.stream()
                .collect(Collectors.groupingBy(
                        e -> e,
                        Collectors.counting()
                ));
    }
}
