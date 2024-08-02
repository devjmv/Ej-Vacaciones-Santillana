package com.vacaciones.Models;

public class CarModel {
    String marca;
    int modelo;
    int motor;
    enum tipoCom {GASOLINA, BIOETANOL, DIESEL, BIODISESEL,
    GAS_NATURAL}
    tipoCom tipoCombustible;
    enum tipoA {CIUDAD, SUBCOMPACTO, COMPACTO, FAMILIAR,
    EJECUTIVO, SUV}
    tipoA tipoAutomóvil;
    int númeroPuertas;
    int cantidadAsientos;
    int velocidadMáxima;
    enum tipoColor {BLANCO, NEGRO, ROJO, NARANJA,
    AMARILLO, VERDE, AZUL, VIOLETA}
    tipoColor color;
    int velocidadActual = 0;


}
