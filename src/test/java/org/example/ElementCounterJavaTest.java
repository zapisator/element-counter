package org.example;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ElementCounterJavaTest {

    @Test
    void testCountElements() {
        final List<Integer> list = List.of(1, 3, 4, 5, 1, 5, 4);
        final Map<Integer, Long> expected = Map.of(1, 2L, 3, 1L, 4, 2L, 5, 2L);

        final Map<Integer, Long> result = ElementCounterJava.countElements(list);

        assertEquals(expected, result);
    }

    @Test
    void testEmptyList() {
        final List<Integer> inputList = Collections.emptyList();
        final Map<Integer, Long> expectedResult = Collections.emptyMap();

        final Map<Integer, Long> actualResult = ElementCounterJava.countElements(inputList);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    void testListWithNulls() {
        final List<String> inputList = Arrays.asList("apple", null, "banana", "apple", null);

        assertThrows(NullPointerException.class, () -> ElementCounterJava.countElements(inputList));
    }
}