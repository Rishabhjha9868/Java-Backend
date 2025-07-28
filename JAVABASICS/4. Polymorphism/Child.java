public class Child extends Parent {

    private int data;

    Child() {
        System.out.println("This is child class");
    }

    Child(int data) {
        this.data = data;
        System.out.println("THis is child parametrize constructor");
    }
}
