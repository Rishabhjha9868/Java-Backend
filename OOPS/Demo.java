class Human{
    private int age;
    private String name;

    Human(){
        System.out.println("I'm a Constructor");
    }

    Human(String name, int age){
        this.name= name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void Being(){
        System.out.println("this is "  + name + " and This is age " + age);
    }
}

public class Demo {
    public static void main(String[] args) {
        Human obj = new Human();
        Human obj1 = new Human("Rohan", 27);
        obj1.Being();
        obj.setAge(21);
        obj.setName("Rishabh Jha");
        System.out.println("Name is " + obj.getName() + " and the age is " + obj.getAge() + ".");
    }
}
