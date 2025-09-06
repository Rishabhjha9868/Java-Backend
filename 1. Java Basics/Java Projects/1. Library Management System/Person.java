public class Person {
    // attribute name, age, and email (base class)
    private String name;
    private int age;
    private String email;

    // constructor
    public void Person(){
        
    }
        // getters and setters
        public void setName(String name) {
        this.name = name;
    } 

     public void setAge(int age) {
        this.age = age;
    } 

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    // methods
    public void displayInfo(){
        System.out.println("Name " + name);
        System.out.println("Age " + age);
        System.out.println("Email " + email);
    }
}
