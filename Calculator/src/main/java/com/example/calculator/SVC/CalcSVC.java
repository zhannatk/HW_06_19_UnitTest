package com.example.calculator.SVC;

public interface CalcSVC {


    /**
     * Метод по адресу /calculator/plus?num1=5&num2=5 должен сложить num1 и num2 и вернуть результат в формате "5 + 5 = 10".
     */

    Integer plus(int n1, int n2);

    /**
     * Метод по адресу /calculator/minus?num1=5&num2=5
     * должен вычесть из num1 num2 и вернуть результат в формате "5 − 5 = 0".
     */

    Integer minus(int n1, int n2);

    /**
     * Метод по адресу /calculator/multiply?num1=5&num2=5 должен умножить num1 на num2 и вернуть результат в формате "5 * 5 = 25".
     */

    Integer multiply(int n1, int n2);

    /**
     * Метод по адресу /calculator/divide?num1=5&num2=5 должен разделить num1 на num2 и вернуть результат в формате "5 / 5 = 1".
     */

    Number divide(int n1, int n2);

    String checkParams(Integer n1, Integer n2);


}
