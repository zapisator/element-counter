package org.example

import org.junit.jupiter.api.Test

import static org.junit.jupiter.api.Assertions.assertEquals
import static org.junit.jupiter.api.Assertions.assertThrows
import static org.junit.jupiter.api.Assertions.assertTrue

class ElementCounterGroovyTest {

    @Test
    void testCountElements() {
        final List<Integer> inputList = Arrays.asList(1, 3, 4, 5, 1, 5, 4);
        final Map<Integer, Long> expectedResult = Map.of(1, 2L, 3, 1L, 4, 2L, 5, 2L);

        final Map<Integer, Long> actualResult = ElementCounterGroovy.countElements(inputList) as Map<Integer, Long>;

        assertTrue(expectedResult == actualResult);
    }

    @Test
    void testEmptyList() {
        final List<Integer> inputList = Collections.emptyList();
        final Map<Integer, Long> expectedResult = Collections.emptyMap();

        final Map<Integer, Long> actualResult = ElementCounterGroovy.countElements(inputList) as Map<Integer, Long>;

        assertEquals(expectedResult, actualResult);
    }

    @Test
    void testListWithNulls() {
        final List<String> inputList = Arrays.asList("apple", null, "banana", "apple", null);

        assertThrows(NullPointerException.class, () -> ElementCounterGroovy.countElements(inputList));
    }
}