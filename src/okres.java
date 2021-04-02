import java.util.Scanner;

public class okres {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Hej jak masz na imię");
        String name = scanner.next();
        System.out.println(name + " czy boli Cię brzuch T/N");
        String brzuch = scanner.next();
        System.out.println(name + " czy masz krwawienie T/N");
        String krwawienie = scanner.next();
        if (brzuch.equalsIgnoreCase("t") && krwawienie.equalsIgnoreCase("t")){
            System.out.println(name + " na pewno masz okres");
        } else if(brzuch.equalsIgnoreCase("n") && krwawienie.equalsIgnoreCase("t")) {
        System.out.println();
                System.out.println(name + " masz okres");
            } else
            System.out.println(name + " nie masz okresu");
        }
    }

