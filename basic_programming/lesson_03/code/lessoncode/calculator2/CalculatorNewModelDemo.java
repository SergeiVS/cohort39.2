package calculator2;


import calculator1.Calculator;

public class CalculatorNewModelDemo {
    public static void main(String[] args) {

        CalculatorNewModel calc = new CalculatorNewModel();

        int result = calc.sum(10,5);

        System.out.println("Сумма значений = " + result);


        result = calc.sub(10,8);

        System.out.println("Результат вычитания  = " + result);


    }
}
