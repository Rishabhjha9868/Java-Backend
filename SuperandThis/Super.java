public class Super extends Demo{

    public Super(){
        super();
        System.out.println("This is Default Constructor of Super");
    }
    public Super(int n){
        this();
        System.out.println("This is Parametrized Constructor of Super");
    }
}
