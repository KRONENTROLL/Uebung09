package h1;

import java.util.ArrayList;

public class PrioListe {
    ArrayList<Patient> myList = new ArrayList<>();

    public void addPatient (Patient p) {
        if (myList.isEmpty()) {
            myList.add(p);
            return;
        }
        for (int i = 0; i < myList.size(); i++) {
            if (p.getPrio() < myList.get(i).getPrio()) {
                myList.add(i,p);
                return;
            }

        }
         myList.add(p);
    }

    public Patient getNextPatient() {
        if (myList.isEmpty()) return null;
        return myList.remove(0);
    }


    public int getPosition (Patient p) {
        return myList.indexOf(p);
    }
}
