public class Suma {
    public static void main(String[] args) {

        try{
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);
            System.out.println("a = "+a+"\tb = "+b);
        } catch (Exception e) {
            System.out.println("Podałeś znak którego nie można przekonwertować na Integer");
        }
    }
}
