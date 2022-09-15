import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Persona {

    public void leerArchivo() throws FileNotFoundException {
        File file = new File("hola.txt");
        Scanner scanner = new Scanner(file);
    }

    public void leerArchivo2() {
        File file = new File("hola.txt");
        try {
            Scanner scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("aaaaa exception!!!");
            throw new RuntimeException(e);
        }
    }
}
