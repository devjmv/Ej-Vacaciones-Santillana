package com.vacaciones.Models;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AmstrongModelTest {
    @Test
    void testIfAmstrong() {
        AmstrongModel amstrong = new AmstrongModel(371);
        assertEquals("El número es Amstrong", amstrong.ifAmstrong());
        amstrong.setNumero(4233);
        assertEquals("El número no es Amstrong", amstrong.ifAmstrong());
    }

    @Test
    void testSetNumero() {
        AmstrongModel amstrong = new AmstrongModel(1);
        amstrong.setNumero(15);
        assertEquals(15, amstrong.getNumero());
    }
}
