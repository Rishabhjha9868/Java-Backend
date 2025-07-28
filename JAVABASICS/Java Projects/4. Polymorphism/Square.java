public class Square extends AreaCalculator {

    // attributes
    private int side;

    // getter and setter 
    public void setside(int side){
        this.side = side;
    }
    // public int getside(){
    //     return side;
    // }

    public double getarea(){
        super.Area();
        return side*side;
    }
    
}
