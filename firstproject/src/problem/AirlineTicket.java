package problem;

public class SeatAssignment {
    private int row;
    private char seat;

    public SeatAssignment(int row, char seat) {
        this.row = row;
        this.seat = seat;
    }

    @Override
    public String toString() {
        return row + String.valueOf(seat);
    }
}

public class AirlineTicket {
    private String departureCity;
    private String arrivalCity;
    private String flightNumber;
    private SeatAssignment seatAssignment;

    public AirlineTicket(String departureCity, String arrivalCity, String flightNumber, SeatAssignment seatAssignment) {
        this.departureCity = departureCity;
        this.arrivalCity = arrivalCity;
        this.flightNumber = flightNumber;
        this.seatAssignment = seatAssignment;
    }

    @Override
    public String toString() {
        return "Flight " + flightNumber + ": " + departureCity + " to " + arrivalCity + ", Seat: " + seatAssignment;
    }

    public static void main(String[] args) {
        AirlineTicket ticket1 = new AirlineTicket("New York", "Los Angeles", "AA123", new SeatAssignment(12, 'A'));
        AirlineTicket ticket2 = new AirlineTicket("San Francisco", "Chicago", "UA456", new SeatAssignment(7, 'F'));

        System.out.println(ticket1);
        System.out.println(ticket2);
    }
}

