public class Main {
    public static void main(String[] args) {
        int number = 10;
        if(number == 10) {
            throw new IllegalStateException();
        }
        else {
            System.out.println("The number is not 10");
        }
    }
}