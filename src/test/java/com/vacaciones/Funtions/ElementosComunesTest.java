package com.vacaciones.Funtions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ElementosComunesTest {
    @Test
    void testElementosComunes() {
        int[] array1 = { 1, 2, 3, 4, 5, 6 };
        int[] array2 = { 2, 5, 2, 6, 2, 5 , 4 };
        ElementosComunes element = new ElementosComunes();
        assertEquals("2 4 5 6 ", element.elementosComunes(array1, array2));
    }
}
