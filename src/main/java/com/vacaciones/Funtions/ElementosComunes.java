package com.vacaciones.Funtions;

public class ElementosComunes {

    public String elementosComunes(int[] array1, int[] array2) {
        String respuesta = "";
        int temp = 0;
        for (int i : array1)
            for (int j : array2) {
                if (i == j && temp != i) {
                    respuesta += i + " ";
                    temp = i;
                }
                // break;
            }
        return respuesta;
    }

}
