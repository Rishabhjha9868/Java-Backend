public class Circle {
    // Attributes 
    private  double radius;
    
    // Constructor 
    Circle(double radius){
        this.radius = radius;

    }

    // Methods
         public double area(){
             return 3.14*radius*radius;
    }
    public double circumference(){
        return 2 * 3.14 * radius;
    }
}
