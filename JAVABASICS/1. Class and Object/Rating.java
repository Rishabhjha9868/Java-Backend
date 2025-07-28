public class Rating {
    // Attribute 
    private String name;
    private double rating;

    // Constructor 
    Rating(String name, double rating){
        this.name = name;
        this.rating = rating;
    }

    // Method
     public void display_Movie(){
        if(rating>4.5) {
            System.out.println("Movie name is "+ name + " and the rating is " + rating);
        }
     }

    
}
