public class Display {
   private int  show = 3;
   private int dis = 0;
   
    public void disp(){
        try{
            dis = show/dis;
        }
        catch(Exception k){
            System.out.println("Something went wrong..");
        }
    }

}
