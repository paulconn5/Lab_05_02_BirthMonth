public class Main {
    public static void main(String[] args) {

        int birthMonth = 19;

        if (birthMonth > 12 || birthMonth < 1) {
            System.out.println("Invalid month entered: " + birthMonth);
        } else {
            System.out.println("Your birth month is " + birthMonth);
        }
    }
}