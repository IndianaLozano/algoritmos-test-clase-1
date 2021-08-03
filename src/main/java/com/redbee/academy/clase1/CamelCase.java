package com.redbee.academy.clase1;

public class CamelCase {


    /**
     * Generar un algoritmo que cuente la cantidad de palabras que hay en un texto teniendo en cuenta que está escrito
     * en notación camelCase.
     * <p>
     * Por ejemplo:
     * hoyVoyAlCine tiene 4 palabras:
     * - hoy
     * - Voy
     * - Al
     * - Cine
     *
     * @param palabra
     * @return
     */
    public static Integer resolver(String texto) {
        Integer longTexto = texto.length();
        Integer cantPalabras = 0;
        if(longTexto == 0){
            return 0;
        } else {
            for (int i = 0; i < longTexto; i++) {
                if (Character.isUpperCase(texto.charAt(i))) {
                    cantPalabras++;
                }
            }
            return cantPalabras + 1;
        }
    }
}
