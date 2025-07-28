public class Librarian extends Person{
    // attribute employeeId
        private double employeeId;

        // constructor 

        public void Librarian(){

        }
        // getter and setters
        
        public void setEmployeeId(double employeeId) {
            this.employeeId = employeeId;
        }
        public double getEmployeeId() {
            return employeeId;
        }

        // methods
        public void displayInfo(){
            super.displayInfo();
            System.out.println("Employee " + employeeId);
        }

}
