package com.vacaciones.Models;

public class CarModel {
    String marca;
    int modelo;
    int motor;

    enum tipoCom {
        GASOLINA, BIOETANOL, DIESEL, BIODISESEL,
        GAS_NATURAL
    }

    tipoCom tipoCombustible;

    enum tipoA {
        CIUDAD, SUBCOMPACTO, COMPACTO, FAMILIAR,
        EJECUTIVO, SUV
    }

    tipoA tipoAutomóvil;
    int númeroPuertas;
    int cantidadAsientos;
    int velocidadMáxima;

    enum tipoColor {
        BLANCO, NEGRO, ROJO, NARANJA,
        AMARILLO, VERDE, AZUL, VIOLETA
    }

    tipoColor color;
    int velocidadActual;
    Boolean automatico;
    int multas;

    public CarModel(String marca, int modelo, int motor, tipoCom tipoCombustible, tipoA tipoAutomóvil,
            int númeroPuertas, int cantidadAsientos, int velocidadMáxima, tipoColor color, Boolean automatico) {
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
        this.tipoCombustible = tipoCombustible;
        this.tipoAutomóvil = tipoAutomóvil;
        this.númeroPuertas = númeroPuertas;
        this.cantidadAsientos = cantidadAsientos;
        this.velocidadMáxima = velocidadMáxima;
        this.color = color;
        this.velocidadActual = 0;
        this.automatico = automatico;
        this.multas = 0;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public int getMotor() {
        return motor;
    }

    public void setMotor(int motor) {
        this.motor = motor;
    }

    public tipoCom getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(tipoCom tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    public tipoA getTipoAutomóvil() {
        return tipoAutomóvil;
    }

    public void setTipoAutomóvil(tipoA tipoAutomóvil) {
        this.tipoAutomóvil = tipoAutomóvil;
    }

    public int getNúmeroPuertas() {
        return númeroPuertas;
    }

    public void setNúmeroPuertas(int númeroPuertas) {
        this.númeroPuertas = númeroPuertas;
    }

    public int getCantidadAsientos() {
        return cantidadAsientos;
    }

    public void setCantidadAsientos(int cantidadAsientos) {
        this.cantidadAsientos = cantidadAsientos;
    }

    public int getVelocidadMáxima() {
        return velocidadMáxima;
    }

    public void setVelocidadMáxima(int velocidadMáxima) {
        this.velocidadMáxima = velocidadMáxima;
    }

    public tipoColor getColor() {
        return color;
    }

    public void setColor(tipoColor color) {
        this.color = color;
    }

    public int getVelocidadActual() {
        return velocidadActual;
    }

    public void setVelocidadActual(int velocidadActual) {
        this.velocidadActual = velocidadActual;
    }

    public Boolean getAutomatico() {
        return automatico;
    }

    public void setAutomatico(Boolean automatico) {
        this.automatico = automatico;
    }

    public int getMultas() {
        return multas;
    }

    public void setMultas(int multas) {
        this.multas = multas;
    }

    void acelerar(int incrementoVelocidad) {
        if (velocidadActual + incrementoVelocidad < velocidadMáxima)
            velocidadActual = velocidadActual + incrementoVelocidad;
        else {
            System.out.println("Maxima velocidad alcansada.");
            setMultas(this.multas++);
        }
    }

    void desacelerar(int decrementoVelocidad) {
        if ((velocidadActual - decrementoVelocidad) > 0)
            velocidadActual = velocidadActual - decrementoVelocidad;
        else
            System.out.println("Minima velocidad alcansada.");
    }

    void frenar() {
        velocidadActual = 0;
    }

    double calcularTiempoLlegada(int distancia) {
        return distancia / velocidadActual;
    }

    void imprimir() {
        System.out.println("Marca = " + getMarca());
        System.out.println("Modelo = " + getModelo());
        System.out.println("Motor = " + getMotor());
        System.out.println("Tipo de combustible = " + getTipoCombustible());
        System.out.println("Tipo de automóvil = " + getTipoAutomóvil());
        System.out.println("Número de puertas = " + getNúmeroPuertas());
        System.out.println("Cantidad de asientos = " + getCantidadAsientos());
        System.out.println("Velocida máxima = " + getVelocidadMáxima());
        System.out.println("Color = " + getColor());
        System.out.println("Es automatico = " + getAutomatico());
        System.out.println("Tiene " + getMultas() + " multas");
    }

    public static void main(String args[]) {
        CarModel auto1 = new CarModel("Ford", 2018, 3, tipoCom.DIESEL, tipoA.EJECUTIVO, 5, 6, 250, tipoColor.NEGRO,
                true);
        auto1.imprimir();
        auto1.setVelocidadActual(100);
        System.out.println("Velocidad actual = " + auto1.velocidadActual);
        auto1.acelerar(20);
        System.out.println("Velocidad actual = " + auto1.velocidadActual);
        auto1.desacelerar(50);
        System.out.println("Velocidad actual = " + auto1.velocidadActual);
        auto1.frenar();
        System.out.println("Velocidad actual = " + auto1.velocidadActual);
    }

    Boolean tieneMultas() {
        return getMultas() > 0 ? false : true;
    }

    void totalMultas() {
        System.out.println("Tiene " + getMultas() + " multas");
    }
}
