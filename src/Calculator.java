public class Calculator {
    private int number1;
    private int number2;


    public void getNumber1(int valueNumm1) { number1 = valueNumm1; }

    public void getNumber2(int valueNumm2) { number2=  valueNumm2; }
    public int dodawanie () { return number1 + number2; }
    public void wyniki () { System.out.println("wynik to " + dodawanie()); }
}
