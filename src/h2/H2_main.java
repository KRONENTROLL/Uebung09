package h2;

public class H2_main {
    public static void main(String[] args) {
        Bus busA = new Bus();
        Bus busB = new Bus();

        Passenger anna = new Passenger("Anna", 2, true);   // steigt bei A ein, fährt über B nach C
        Passenger ben = new Passenger("Ben", 3, false);    // steigt bei A ein, fährt 3 Stationen
        Passenger clara = new Passenger("Clara", 1, true); // steigt bei A ein, fährt 1 Station

        busA.enterBus(anna);
        busA.enterBus(ben);
        busA.enterBus(clara);

        System.out.println("Bus A zu Beginn: " + busA);

        busA.nextStop();
        System.out.println("Nach 1. Haltestelle: " + busA);

        busA.nextStop();
        System.out.println("Nach 2. Haltestelle: " + busA);

        System.out.println("Entfernte Passagiere ohne Ticket: " + busA.findPassengersWithoutTickets());
        System.out.println("Bus A nach Ticketkontrolle: " + busA);

        busA.transferPassengers(busB, new String[]{"Anna"});
        System.out.println("Bus A nach Transfer: " + busA);
        System.out.println("Bus B nach Transfer: " + busB);
    }
}


