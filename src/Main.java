import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        File file = new File("hola.txt");
        try {
            Scanner scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            //throw new RuntimeException(e);
        }
        Persona p = new Persona();
        p.leerArchivo2();

        try {
            p.leerArchivo();
        } catch (FileNotFoundException e) {
            System.out.println("algo salió mal :/");
            throw new RuntimeException(e);
        }

        int[] arr = {0, 1, 2, 3, 4};

        for (int i = 0; i <= 5; i++) {
            try {
                System.out.println(arr[i]);
            } catch (ArrayIndexOutOfBoundsException e) {
                // System.out.println("Ocurrió un error!!! :(");
                // System.out.println(e);
            }
        }


        System.out.println("el final del programa");


    }
}