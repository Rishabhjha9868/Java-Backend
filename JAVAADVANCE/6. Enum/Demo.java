 enum Status{
    Running, Building, Confirmed, Pending 
 }

public class Demo {

    public static void main(String[] args) {
        int s =0;
        Status ss = Status.Pending;
        System.out.println(ss);
        System.out.println(Status.Running);
        System.out.println("This is Just a Line Change Statement");
        Status[] st = Status.values();
        for(Status i : st){
            System.out.println(i);
        }

    }
}