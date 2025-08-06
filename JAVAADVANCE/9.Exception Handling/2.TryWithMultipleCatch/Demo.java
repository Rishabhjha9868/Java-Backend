public class Demo {
    public static void main(String[] args) {
        int i=0;
        int j=10;
        String s ="Rishabh Jha";
        int[] nums = new int[5];
        try{
            i = j/i;
            System.out.println(s.length());
            System.out.println(nums[6]);
        }
        catch(ArithmeticException e){
            System.out.println("Please Check Your Division");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Please be in Your Limit");
        }
        catch(NullPointerException e){
            System.out.println("String does not have any length");
        }
        catch(Exception e){
            System.out.println("Something went wrong " + e);
        }

        System.out.println(i);
    }
}
