public class Tester {
    public static void main(String[] args) {

        // Class -> Student 
        // Student obj1 = new Student();
        // GraduateStudent obj2 = new GraduateStudent();
        // obj1.setmarks(95);
        // obj2.setname("Ajay");
        // obj2.setrollNo(21);
        // obj2.setthesis("God");
        // System.out.println("The name of the Student "+ obj2.getname() + " rollNo is " + obj2.getrollNo() + " marks obtained "+ obj2.getmarks()+ " and the Thesis is about " + obj2.getthesis());

        // Class -> Vehicle 
        // Vehicle obj1 = new Vehicle();
        // Car obj2 = new Car();
        // obj2.setbrand("BMW");
        // obj2.setmodel("V7");
        // obj2.setprice(25_000_000);
        // obj2.setfueltype("Petrol");

        // System.out.println("The name of the car is " + obj2.getbrand() + " and the model is " + obj2.getmodel() + " and the price is " + obj2.getprice() + " fuel Type is " + obj2.getfuelType());

        Employee obj1 = new Employee();
        Manager obj2 = new Manager();
        obj2.setdepartment("HR");
        obj2.setempId(101);
        obj2.setname("Ajay");
        obj2.setsalary(75_000);
        System.out.println("The name of the employee is " + obj2.getname() + " and empId is " + obj2.getempId() + " Salary is " + obj2.getsalary() + " and his department is " + obj2.getdepartment());

    }
    
}
