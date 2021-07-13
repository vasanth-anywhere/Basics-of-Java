public class Main {

    public static void main(String[] args) {

        try {
            int workArray[]=new int[10];
            try {
                workArray[9] = 100/0;
            }
            catch (ArithmeticException e) {
                System.out.println("Arithmetic Exception got caught");
            }
            workArray[10] = 4;
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("ArrayIndexOutOfBounds Exception occurs");
        }
        catch (Exception e)
        {
            System.out.println("Parent Exception occurs");
        }
        finally {
            System.out.println("Irrespective of whether the exception handled or not, finally will get executed.");
        }
        System.out.println("Rest of the program");
    }
}
