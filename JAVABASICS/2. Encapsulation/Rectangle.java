public class Rectangle {
    // attributes
    private double length;
    private double width;

    // Getter and Setter
    public void setlength(double length){
        this.length = length;
    }
    public void setwidth(double width){
        this.width = width;
    }
    public double getarea(){
        return length*width;
    }
    public double getperimeter(){
        return 2*(length+width);
    }
    
}
