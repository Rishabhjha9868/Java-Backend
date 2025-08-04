   interface Display {
    void show(int i);
    
  }  
    


public class Demo {
    public static void main(String[] args) {
        // Display obj = new Display() {
        //     public void show(int i){
        //         System.out.println("This is show " + i);
        //     }
        // };obj.show(5);

        Display obj = (int i) -> {
            System.out.println("This is show " + i);
        };obj.show(5);

        FatArrowOnReturn obj2 = new FatArrowOnReturn() {
            public int scan(int i, int j){
               return result = i+j;
            }
        };obj2.scan(2,7);
    }
    
}
