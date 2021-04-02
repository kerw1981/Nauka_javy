import java.util.Scanner;

public class Petle {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        System.out.println("podaj słowo");
        String word = scaner.next();
boolean palindrom=true;

        for (int i = 0; i < word.length() /2; i++) {
            if (word.charAt(i) != word.charAt(word.length() -1-i)) {

                palindrom = false;
                break;
            }
        }
        if(palindrom) {
            System.out.println("jest palindromem");
        } else
            System.out.println("nie jest palindromem");
    }
}