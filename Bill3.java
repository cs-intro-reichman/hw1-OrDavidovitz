// Splits a restaurant bill evenly among three diners.
public class Bill3 {
    public static void main(String[] args) {
        String name2 = args[0];
        String name3 = args[1];
        String name4 = args[2];
        int bill = Integer.parseInt(args[3]);
        double eachPays = Math.ceil(bill / 3.0);
        System.out.println("Dear " + name4 + ", " + name3 + ", and " + name2 + ": pay " + eachPays + " shekels each");

    }
}
