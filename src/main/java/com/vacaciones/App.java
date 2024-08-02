package com.vacaciones;

import java.util.Scanner;

import com.vacaciones.Models.AmstrongModel;
import com.vacaciones.Models.MesModel;
import com.vacaciones.Funtions.*;

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

        Scanner entrada = new Scanner(System.in);

        // Ej Meses y días
        System.out.println("----------Ej Meses y Días");
        System.out.print("Introduce el mes numerico de 1 al 12: ");
        int mesInt = entrada.nextInt();
        MesModel mes = new MesModel(mesInt);
        String day = mes.GetPropiedades();
        System.out.println(day);
        //

        // Ej Amstrong
        System.out.println("----------Ej Amstrong");
        System.out.print("Introduce el numero: ");
        int number = entrada.nextInt();
        AmstrongModel amstrong = new AmstrongModel(number);
        String isAmstrong = amstrong.ifAmstrong();
        System.out.println(isAmstrong);
        //

        // Ej Elementos comunes
        System.out.println("----------Elementos comunes");
        System.out.println("Dado los dos Arrays se mostraran los numeros comunes.");
        ElementosComunes elementosComunes = new ElementosComunes();
        int[] array1 = { 1, 2, 3, 4, 5, 6 };
        int[] array2 = { 2, 5, 2, 6, 2, 5 , 4 };
        System.out.println(elementosComunes.elementosComunes(array1, array2));
        //

        entrada.close();
    }
}
