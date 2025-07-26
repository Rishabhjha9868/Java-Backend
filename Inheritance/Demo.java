public class Demo {
    public static void main(String[] args) {
        Calculator obj1 =new Calculator();
        AdvanceCalc obj2 = new AdvanceCalc();
        SuperComputer obj3 = new SuperComputer();
      int r1=  obj2.Sub(5, 4);
       int r2 =  obj2.add(5, 4);
       int r3 = obj3.multi(5, 4);
       int r4 = obj3.div(20, 4);
       double r5 = obj3.pow(5, 4);
    System.out.println(r1 + " "+ r2 + " "+  r3 + " " + r4 + " " + r5);
    }
}