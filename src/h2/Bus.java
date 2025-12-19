package h2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Bus {
    ArrayList<Passenger> passengers = new ArrayList<>();

    Bus () {
        passengers = new ArrayList<>();
    }

    public void enterBus(Passenger p) {
        passengers.add(p);
    }

    private void exitBus() {
        for (int i = passengers.size() - 1; i >= 0; i--) {
            Passenger p = passengers.get(i);
            if (p.planned == p.visited) {
                passengers.remove(i);
            }
        }
    }

    public void nextStop(Passenger[] boarding) {
        for (Passenger p : passengers) {
            p.visited++;
        }
        exitBus();
        if (boarding != null) {
            for (Passenger p : boarding) {
                passengers.add(p);
            }
        }
    }

    public void nextStop() {
        for (Passenger p : passengers) {
            p.visited++;
        }
        exitBus();
    }

    public List<Passenger> findPassengersWithoutTickets() {
        List<Passenger> deletedPassengers = new ArrayList<>();
        for (int i = passengers.size() - 1; i >= 0; i--) {
            Passenger p = passengers.get(i);
            if (!p.ticket) {
                deletedPassengers.add(p);
                passengers.remove(i);
            }
        }
        return deletedPassengers;
    }

    public void transferPassengers(Bus otherBus, String[] passengerNames) {
        ArrayList<Passenger> toTransfer = new ArrayList<>();
        Iterator<Passenger> it = passengers.iterator();

        while (it.hasNext()) {
            Passenger p = it.next();
            for (String name : passengerNames) {
                if (p.getName().equals(name)) {
                    toTransfer.add(p);
                    it.remove();
                    break;
                }
            }
        }

        for (Passenger p : toTransfer) {
            otherBus.enterBus(p);
        }
    }

    @Override
    public String toString() {
        return passengers.toString();
    }
}

