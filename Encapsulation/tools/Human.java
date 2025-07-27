package tools;
public class Human extends HomoSapien {
    private int age;
    private String name;

    public int getage(){
        return age;
    }
    public String getname(){
        return name;
    }

    public void setname(String name){
        this.name = name;
    }
    public void setage(int age){
        this.age = age;
    }
}
