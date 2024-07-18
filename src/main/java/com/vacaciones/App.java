package com.vacaciones;

import java.util.Scanner;

import com.vacaciones.Models.MesModel;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        // Ej Meses y días
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce el mes numerico: ");
        int mesInt = entrada.nextInt();
        MesModel mes = new MesModel(mesInt);
        String day = mes.GetPropiedades();
        System.out.println(day);
        entrada.close();
        //
    }
}
