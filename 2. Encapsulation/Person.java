public class Person {
    // attributes
    private String name;
    private int age;

    // Getters and Setters
    public void setname(String name){
        this.name = name;
    }
    public void setage(int age){
        if(age >0){
            this.age = age;
        }
    }
    public String getname(){
        return name;
    }
    public int getage(){
        return age;
    }
    
}
