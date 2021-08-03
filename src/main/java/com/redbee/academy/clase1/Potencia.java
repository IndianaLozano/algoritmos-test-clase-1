package com.redbee.academy.clase1;

import com.sun.jdi.IntegerType;
import java.lang.Math;
public class Potencia {

    /**
     * Generar un algoritmo para elevar un número (base) a una potencia dada
     *
     * @param base
     * @param potencia
     * @return
     */
    public static Integer resolver(Integer base, Integer potencia) {
        if(potencia == 0){
            return 1;
        } else {
            Integer result = (int) Math.pow(base, potencia);
            return result;
        }
    }
}
