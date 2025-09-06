public class Circle {
    // attribute
    private double radius;

    // Getter and Setter
    public void setradius(double radius){
        this.radius = radius;
    }

    public double getarea(){
        return 3.14*radius*radius;
    }
    public double getcircumference(){
        return 2*3.14*radius;
    }
    
}
