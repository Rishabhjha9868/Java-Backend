public class Parent extends GrandParent {
    private int data;

    Parent() {
        super(5);
        System.out.println("This is parent class");
    }

    Parent(int data) {
        super();
        this.data = data;
        System.out.println("THis is parent parametrize constructor");
    }
}