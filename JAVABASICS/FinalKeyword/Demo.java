// final class A { this is final class prevent inheritane
    class A {
//  public void show(){
    // public final void show(){ this is final method
    public  void show(){
    System.out.println("in A");
 }
  public int calc(int i, int j){
    return i+j;
  }
    
}
class B extends A{
    public int calc(int i, int j, int k){
        return j+i+k;
    }
    public void show(){

        System.out.println("this is B");
    }

}

public class Demo {
    public static void main(String[] args) {
        A obj1 = new A();
        B obj2 = new B();
        obj1.calc(34, 16);
        obj1.show();
       int kew =  obj2.calc(23, 23, 4);
       System.out.println(kew);
        
    }
}
