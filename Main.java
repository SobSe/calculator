package calculator;

public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.supplier.get();

        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1,1);
        //Ошибка деления на ноль. В лябда выражении добвил проверку y на ноль
        //Если y равен нулю, то возвращается ноль
        int c = calc.devide.apply(a, b);

        calc.println.accept(c);
    }
}
