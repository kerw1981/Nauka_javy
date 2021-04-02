import java.util.Scanner;

public class CalculatorOperations {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        Scanner skaner = new Scanner(System.in);
        System.out.println("podaj pierwszą cyfrę");
        calculator.getNumber1(skaner.nextInt());
        System.out.println("podaj drugą cyfrę");
        calculator.getNumber2(skaner.nextInt());
        calculator.wyniki();

    }
}
