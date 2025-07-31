interface A extends X{
//    final and static
//   public int age = 21;
//   public String area = "Delhi";    
  void show();
  void config();
}

interface X {
    void run();
}

class B implements A {
    public void show(){
        System.out.println("This is Show in B");
    }
    public void config(){
        System.out.println("This is Config in B");
    }
    public void run(){
        System.out.println(" in run..");

    }
}

public class Demo { 
    public static void main(String[] args) {
       A obj = new B();
       obj.show();
       obj.config();
       obj.run();
    }
}
