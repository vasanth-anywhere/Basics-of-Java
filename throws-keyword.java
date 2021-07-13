public class Main {
    public static void main(String[] args) throws IOException {
        int number = 10;
        if(number == 10) {
            throw new IOException();
        }
        else {
            System.out.println("The number is not 10");
        }
    }
}