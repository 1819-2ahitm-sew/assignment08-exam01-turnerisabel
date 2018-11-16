package at.htl.exam01.document;

public class Main {

    /**
     *
     * Führen Sie hier folgendes durch:
     *
     * 1. Erstellen Sie 2 Bücher und ein email
     *    Buch: "Rowlings", "Harry Potter und der Stein der Weisen"
     *    Email: "Susi", "Bewerbung", "CoolCompany"
     *    Buch: "Tolkien", "lordOfTheRings"
     *
     * 2. Erstellen Sie ein Document-Array und speichern Sie obige Dokumente in diesem Array.
     *
     * 3. Geben Sir die Inhalte dieser Documente wie folgt aus.
     *    Nutzen Sie dabei die Mechanismen der Vererbung.
     *    Erstellen Sie außerdem geeignete toString-Methoden
     *
     * 4. Zählen Sie die Bücher und emails im Array und geben Sie die jeweilige Anzahl aus.
     *
     * @param args
     */
    public static void main(String[] args) {

        String [] document = new String[3];
        document[0] = "Book: 'Harry Potter und der Stein der Weisen' von 'Rowlings'";
        document[1] = "Email: 'Bewerbung' von 'Susi' an 'CoolCompany'";
        document[2] = "Book: 'lordOfTheRings' von 'Tolkien'";


        System.out.println("Buch:  'Rowlings', 'Harry Potter und der Stein der Weisen'");
        System.out.println("Email: 'Susi', 'Bewerbung', 'CoolCompany'");
        System.out.println("Buch: 'Tolkien', 'lordOfRings'");

    }


}
