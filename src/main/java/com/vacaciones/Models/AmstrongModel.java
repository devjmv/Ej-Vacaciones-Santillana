package com.vacaciones.Models;

public class AmstrongModel {

    private int numero;

    public AmstrongModel(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    private static int digitos(int x) {
        int cont = 0;
        while (x > 0) {
            cont++;
            x /= 10;
        }
        return cont;
    }

    public String ifAmstrong() {

        int número = this.numero;
        int dígitos = digitos(número);
        double suma = 0;

        while (número > 0) {
            suma += Math.pow(número % 10, dígitos); // el dígito elevado al cubo
            número /= 10;
        }

        if (suma == numero)
            return "El número es Amstrong";
            else
            return "El número no es Amstrong";
    }
}
