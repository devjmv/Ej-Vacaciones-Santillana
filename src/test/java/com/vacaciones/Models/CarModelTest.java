package com.vacaciones.Models;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CarModelTest {

    CarModel car = new CarModel("Ford", 2018, 3, CarModel.tipoCom.DIESEL, CarModel.tipoA.EJECUTIVO, 5, 6, 250, CarModel.tipoColor.NEGRO, true);

    @Test
    void testAcelerar() {
        car.acelerar(130);
        assertEquals(130, car.getVelocidadActual());
    }

    @Test
    void testCalcularTiempoLlegada() {

    }

    @Test
    void testDesacelerar() {
        car.acelerar(130);
        car.desacelerar(30);
        assertEquals(100, car.getVelocidadActual());
    }

    @Test
    void testFrenar() {
        car.acelerar(130);
        car.frenar();
        assertEquals(0, car.getVelocidadActual());
    }

    @Test
    void testImprimir() {
        car.imprimir();
    }

    @Test
    void testTieneMultas() {
        car.acelerar(150);
        car.acelerar(280);
        assertEquals(1, car.getMultas());
    }

    @Test
    void testTotalMultas() {
        car.acelerar(150);
        car.acelerar(280);
        car.totalMultas();
    }
}
