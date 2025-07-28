public class Movie {
    // Attributes: name, duration, available_seats
    private String name;
    private double duration;
    private int available_seats;
      
    // Constructor 
    Movie(String name, double duration, int available_seats){
        this.available_seats = available_seats;
        this.duration = duration;
        this.name = name;
    }
    
    // Methods: book_ticket(n) → reduces available seats
    //         cancel_ticket(n) → adds back to available seats
    public void book_ticket(){
        if (available_seats>=1) {
                available_seats -= 1;
        System.out.println("Your Seat is booked");
        } else {
            System.out.println("Seat is unAvailable😔");
        }
     }

    public void cancel_ticket(){
        available_seats += 1;
        System.out.println("Your Seat is Cancelled Successfully");
    }
}
