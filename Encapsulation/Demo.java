
import tools.Human;
import tools.HomoSapien;

public class Demo {
public static void main(String[] args) {
    Human obj = new Human();
    HomoSapien obj1 = new HomoSapien();
    obj.setage(25);
    obj.setname("Rishabh Jha");
    System.out.println("Name is " + obj.getname() + " and Age is " + obj.getage() );
}
    
}