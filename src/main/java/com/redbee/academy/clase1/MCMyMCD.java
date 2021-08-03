package com.redbee.academy.clase1;

public class MCMyMCD {
    /**
     * Generar un algoritmo que resuelva el mínimo común múltiplo entre 2 números
     *
     * @param num1
     * @param num2
     * @return
     */
    public static Integer mcm(int num1, int num2) {
        int a = Math.max(num1, num2);
        int b = Math.min(num1, num2);

        Integer result = (a * b) / mcd(a, b);
        return result;
    }

    /**
     * Generar un algoritmo que resuelva el máximo común divisor entre 2 números
     *
     * @param num1
     * @param num2
     * @return
     */
    public static Integer mcd(int num1, int num2) {
        if(num2==0) {
            return num1;
        } else {
            return mcd(num2, num1 % num2);
        }
    }
}
