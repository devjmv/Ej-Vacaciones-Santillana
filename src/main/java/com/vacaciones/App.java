package com.vacaciones;

import java.util.Scanner;

import com.vacaciones.Models.AmstrongModel;
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
        System.out.println("Ej Meses y Días");
        System.out.print("Introduce el mes numerico de 1 al 12: ");
        int mesInt = entrada.nextInt();
        MesModel mes = new MesModel(mesInt);
        String day = mes.GetPropiedades();
        System.out.println(day);
        //

        // Ej Amstrong
        System.out.println("Ej Amstrong");
        System.out.print("Introduce el numero: ");
        int number = entrada.nextInt();
        AmstrongModel amstrong = new AmstrongModel(number);
        String isAmstrong = amstrong.ifAmstrong();
        System.out.println(isAmstrong);
        //

        entrada.close();
    }
}
