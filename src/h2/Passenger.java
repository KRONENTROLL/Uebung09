package h2;

public class Passenger {
    public String name;
    public int planned;
    public int visited;
    public boolean ticket;

    public Passenger(String name, int planned, boolean ticket) {
        this.name = name;
        this.planned = planned;
        this.ticket = ticket;
        visited = 0;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name + " (visited: " + visited + ", planned: " + planned + ", ticket: " + ticket + ")";
    }
}

