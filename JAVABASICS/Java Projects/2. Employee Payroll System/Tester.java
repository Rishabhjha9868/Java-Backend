public class Tester {
    public static void main(String[] args) {
        Employee obj = new Employee("Rishabh", 21, 21);
        obj.calculateSalary();
        obj.displayInfo();

        FullTimeEmployee obj1 = new FullTimeEmployee( 25_000);
        obj1.calculateSalary();
        obj1.displayInfo();

        PartTimeEmployee obj2 = new PartTimeEmployee(500, 5);
        obj2.calculateSalary();
        obj2.displayInfo();
    }
}
