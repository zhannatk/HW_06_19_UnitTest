package com.example.calculator.Controller;

import com.example.calculator.SVC.CalcSVC;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalcController {
    private final CalcSVC calcSVC;

    public CalcController(CalcSVC calcSVC) {
        this.calcSVC = calcSVC;
    }

    //    Метод по адресу /calculator должен вернуть приветствие "Добро пожаловать в калькулятор".
    @GetMapping
    String welcome() {
        return "Велком ту калькулятор";
    }

    //    Метод по адресу /calculator/plus?num1=5&num2=5 должен сложить num1 и num2 и вернуть результат в формате "5 + 5 = 10".
    @GetMapping("/plus")
    String plus(@RequestParam(name = "num1", required = false) Integer num1, @RequestParam(name = "num2", required = false) Integer num2) {
        return checkParamsAndDoOperation(num1, num2, '+');
    }

    //    Метод по адресу /calculator/minus?num1=5&num2=5 должен вычесть из num1 num2 и вернуть результат в формате "5 − 5 = 0".
    @GetMapping("/minus")
    String minus(@RequestParam(name = "num1", required = false) Integer num1, @RequestParam(name = "num2", required = false) Integer num2) {
        return checkParamsAndDoOperation(num1, num2, '-');

    }

    //    Метод по адресу /calculator/multiply?num1=5&num2=5 должен умножить num1 на num2 и вернуть результат в формате "5 * 5 = 25".
    @GetMapping("/multiply")
    String multiply(@RequestParam(name = "num1", required = false) Integer num1, @RequestParam(name = "num2", required = false) Integer num2) {
        return checkParamsAndDoOperation(num1, num2, '*');
    }

    //    Метод по адресу /calculator/divide?num1=5&num2=5 должен разделить num1 на num2 и вернуть результат в формате "5 / 5 = 1".
    @GetMapping("/divide")
    String divide(@RequestParam(name = "num1", required = false) Integer num1, @RequestParam(name = "num2", required = false) Integer num2) {
        return checkParamsAndDoOperation(num1, num2, '/');

    }

    private String checkParamsAndDoOperation(Integer n1, Integer n2, char operation) {
        String res = calcSVC.checkParams(n1, n2);
        if (res != null) return res;

        switch (operation) {
            case '+': {
                res = n1 + "+" + n2 + "=" + calcSVC.plus(n1, n2);
                break;
            }
            case '-': {
                res = n1 + "-" + n2 + "=" + calcSVC.minus(n1, n2);
                break;
            }
            case '*': {
                res = n1 + "*" + n2 + "=" + calcSVC.multiply(n1, n2);
                break;
            }
            case '/': {
                res = n1 + "/" + n2 + "=" + calcSVC.divide(n1, n2);
                break;
            }

        }
        return res;


    }


}
