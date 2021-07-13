class Main{
    public static void main(String args[]) {
        int number;
        try {
            number = 50/0; //Risky code
        }
        catch (ArithmeticException exception) {
            number = 50/2; //Handling code
            System.out.println(exception.printStackTrace());
            System.out.println(exception);
            System.out.println(exception.getMessage());
        }
        System.out.println(number);
    }
}
