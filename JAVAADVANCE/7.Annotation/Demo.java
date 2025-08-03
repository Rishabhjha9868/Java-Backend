   class A {
     public void show(){
     System.out.println("This is Show of A");
  }
  }
  class B extends A{
     public void show(){
     System.out.println("This is Show of B");
  }
  }

public class Demo {
    public static void main(String[] args) {
        A obj = new B();
        // B obj1  = new B();
        // obj1.show();
        obj.show();
    }
}
