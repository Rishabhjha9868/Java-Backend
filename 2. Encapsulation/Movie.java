public class Movie {
    // attribute
    private String name;
    private double rating;

    public void setname(String name){
        this.name = name;
    }
    public void setrating(double rating){
        if(rating<= 10){
            this.rating = rating;
        }
    }
    public String getname(){
        return name;
    }
    public double getrating(){
        return rating;
    }
    
}
