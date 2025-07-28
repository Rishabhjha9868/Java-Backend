public class Circle extends Shape {
    // attribute
    private double radius;

    // Getter and Setter 
    public void setradius(double radius){
        this.radius = radius;
    }
    public double getradius(){
        return radius;
    }


    // methods
    public double area(double radius){
        super.area();
        return 3.14*radius*radius;
    }
    
}
