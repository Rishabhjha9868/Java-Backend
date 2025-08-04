public class Demo {
    public static void main(String[] args) {
        Display obj = new Display();
        obj.disp();
        int i=9; 
        int j=0;
        try {
            j = 18/i;
        } catch (Exception e) {
            System.out.println("Something error Found..");
        }
        System.out.println(j);
        System.out.println("Ok Bye" );
    }
}
