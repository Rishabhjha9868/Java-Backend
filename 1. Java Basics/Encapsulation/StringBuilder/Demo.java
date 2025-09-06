public class Demo {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Name");
        sb.append("Rishabh Jha");
        sb.insert(4, " is ");
        sb.insert(0, "My ");
        sb.reverse();
        sb.charAt(8);
        System.out.println(sb);
        System.out.println(sb.charAt(8));
    }
    
}
