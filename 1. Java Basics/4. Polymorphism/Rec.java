public class Rec extends AreaCalculator {
    // attributes 
    private double length;
    private double width;

    // getter and setter 
        public void setlength(double length){
            this.length = length;
        }
        public void setwidth(double width){
            this.width = width;
        }
        // public double getlength(){
        //     return length;
        // }
        // public double getwidth(){
        //     return width;
        // }


    public double getarea(){
        return length *width;
    }
    
}
