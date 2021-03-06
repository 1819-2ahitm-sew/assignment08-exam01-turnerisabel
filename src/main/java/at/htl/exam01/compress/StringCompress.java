package at.htl.exam01.compress;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class StringCompress {

    private static final String FILE_NAME = "sample.txt";
    int anzahl = 0;
    int counter = 0;


    /**
     * Main-Methode, hier wird das StringCompress-Objekt erstellt
     * und die Methoden des Objekts werden aufgerufen
     *
     * @param args
     */
    public static void main(String[] args) {
        StringCompress sc = new StringCompress();
        String[] text = sc.readFromFile(FILE_NAME);
        sc.print(text);
    }


    /**
     * Sämtliche Zeilen werden aus der Textdatei eingelesen
     * zB 5A
     * Nun wird in das String-Array AAAAA geschrieben
     * <p>
     * Bsp Testdatei
     * 5A
     * 3B
     * 4C
     * <p>
     * ergibt eine String-Array mit 3 Elementen
     * AAAAA
     * BBB
     * CCCC
     *
     * @param fileName
     * @return String-Array mit dem entpacktem Text
     */
    public String[] readFromFile(String fileName) {

//        String [] array = new String[counter];
//
//        try (Scanner scanner = new Scanner(new FileReader(FILE_NAME))){
//            while (scanner.hasNextLine()){
//                for (int i = 0; i < array.length; i++) {
//                    array[i] = scanner.nextLine();
//                    System.out.println(array[i]);
//                }
//            }
//        }
//        catch (FileNotFoundException e){
//            System.err.println();
//        }
//
//        return null;


        String[] lines = new String[4];

        try (Scanner scanner = new Scanner(new FileReader((FILE_NAME)))) {

            int lineNo = 0;

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();

                char letter = line.charAt(0);
                String noStr = line.substring(1);

                int noAnzahl = Integer.parseInt(noStr);

                lines[lineNo] = "";
                for (int j = 0; j < noAnzahl; j++) {
                    lines[lineNo] += letter;

                }

                lineNo++;
            }
        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
        }

        return lines;
    }


    /**
     * Der Inhalt des String-Arrays wird zeilenweise auf der Console ausgegeben
     *
     * @param lines String-Array
     *              <p>
     *              Die Anzahl der Zeilen der übergebenen Textdatei wird bestimmt
     * @param lines
     * @return Anzahl der Zeilen in der Textdatei
     */

    public void print(String[] lines) {


        System.out.println("");

    }

    /**
     * Die Anzahl der Zeilen der übergebenen Textdatei wird bestimmt
     *
     * @param fileName
     * @return Anzahl der Zeilen in der Textdatei
     */

    public int getNoOfLines(String fileName) {
//
//            try (Scanner scanner = new Scanner(new FileReader(FILE_NAME))) {
//                while (scanner.hasNextLine()) {
//                    scanner.nextLine();
//                    counter++;
//
//                }
//            }
//            catch (FileNotFoundException e){
//                System.err.println();
//            }
//                    return counter;
//                }
        return -1;
    }

}