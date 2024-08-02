package com.vacaciones.Models;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MesModelTest {
    @Test
    void testGetDayOfMonth() {
        MesModel mes = new MesModel(2);
        assertEquals("Febrero", mes.GetNumberDayOfMonth());
    }

    @Test
    void testGetNumberDayOfMonth() {
        MesModel mes = new MesModel(2);
        assertEquals(29, mes.GetDayOfMonth());
    }
}
