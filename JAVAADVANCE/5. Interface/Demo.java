interface A {
  void show();
  void config();
}

class B implements A {
    public void show(){
        System.out.println("This is Show in B");
    }
    public void config(){
        System.out.println("This is Config in B");
    }
}

public class Demo { 
    public static void main(String[] args) {
       A obj;
       obj  = new B();
       obj.show();
       obj.config();
    }
}
