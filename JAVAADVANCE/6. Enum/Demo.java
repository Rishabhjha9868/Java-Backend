 enum Status{
    Running, Building, Confirmed, Pending 
 }

public class Demo {

    public static void main(String[] args) {
        // int s =0;
        // Status ss = Status.Pending;
        // System.out.println(ss);
        // System.out.println(Status.Running);
        // System.out.println("This is Just a Line Change Statement");
        // Status[] st = Status.values();
        // for(Status i : st){
        //     System.out.println(i);
        // }
        // Status s = Status.Pending;

        // if and else statements 
        // Status s = Status.Confirmed;
        // if(s == Status.Building){
        //     System.out.println("This is Building");
        // } else if(s == Status.Running){
        //     System.out.println("This is Running");
        // } else if(s==Status.Confirmed){
        //     System.out.println("This is Confirmed");
        // } else{
        //     System.out.println("This is Pending");
        // }

        // Switch 
        Status s = Status.Building;

       switch (s) {
        case Building:
            System.out.println("This is done");
            break;
        case Running : 
        System.out.println("This is Running/Crazy");
        break;
        case Confirmed : 
        System.out.println("This is conform'");
        break;
        case Pending : 
        System.out.println("This is pending");
        break;
        default:
            break;
       }


    }
}