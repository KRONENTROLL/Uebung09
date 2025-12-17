package h1;

public class H1_main {
    public static void main(String[] args) {
        PrioListe liste = new PrioListe();

        Patient A = new Patient("A", 1);
        Patient B = new Patient("B", 10);
        Patient C = new Patient("C", 5);
        Patient D = new Patient("D", 7);

        liste.addPatient(A);
        liste.addPatient(B);
        liste.addPatient(C);

        System.out.println("Liste nach Hinzufügen von A, B, C:");
        printListe(liste);

        liste.addPatient(D);
        System.out.println("\nListe nach Hinzufügen von D:");
        printListe(liste);

        Patient next = liste.getNextPatient();
        System.out.println("\nNächster Patient aufgerufen: " + next.getName());
        System.out.println("Liste nach Aufruf des nächsten Patienten:");
        printListe(liste);

        System.out.println("\nPosition von D: " + liste.getPosition(D));
    }

    public static void printListe(PrioListe liste) {
        for (int i = 0; i < liste.myList.size(); i++) {
            Patient p = liste.myList.get(i);
            System.out.println("Position " + i + ": " + p.getName() + " (Prio " + p.getPrio() + ")");
        }
    }
}

