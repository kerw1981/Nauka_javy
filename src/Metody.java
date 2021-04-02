import java.util.Scanner;

public class Metody {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        petla_pierwsza:for (int i = 1; i <=10 ; i++) {
            if (!(i%2==0))
            continue;

            for (int j = 1; j <=10 ; j++) {
                if (j>i)
                    continue petla_pierwsza;
                System.out.print(j);

            }

        }
    }
}
