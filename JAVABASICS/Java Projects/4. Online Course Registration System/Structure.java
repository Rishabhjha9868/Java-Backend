public class Structure {

//  attributes
    private String name;
    private String email;
  
//   constructor 
        Structure(){
             System.out.println("This is Parent");
    }

//   parametrized constructor
        Structure(String name, String email){
            this.name = name;
            this.email = email;
        }

        // Methods 
        public void displayInfo(){
            System.out.println("name is " + name);
            System.out.println("email is " + email);
        }

    
}