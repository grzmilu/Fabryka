
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try {
            FabrykaStron fabrykaStron = new FabrykaStron();
            Scanner odczyt = new Scanner(System.in);
            System.out.println("Wybierz strone do stworzenia (1.Informacyjna, 2.Galeria, 3.Kontaktowa, 4.Aktualnosci)");
            Strona str = fabrykaStron.wybierzStrone(odczyt.nextLine());
            System.out.println("Podaj nazwe pliku");
            str.tworzStrone(odczyt.nextLine());
        } catch (Exception e) {
            System.out.println("Bledne dane wejsciowe");
        }
    }

}
