public class AndThis extends Super{
    AndThis(){
        super(5);
        System.out.println("This is AndThis Constructor");
    }

    AndThis(int n){
       this();
        System.out.println("This is parametrized constructor of AndThis ");
    }
    
}
