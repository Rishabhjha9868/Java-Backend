public class GrandParent {

    private int data;

    GrandParent() {
        super();
        System.out.println("This is grandParent");
    }

    GrandParent(int data) {
        this.data = data;
        System.out.println("THis is grandparent parametrize constructor");
    }
}
