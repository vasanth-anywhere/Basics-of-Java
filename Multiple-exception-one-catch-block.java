public class Main{

     public static void main(String []args){
        try{    
            int array[] = newint[10];    
            array[10] = 30/0;    
        }    
        catch(ArithmeticException | ArrayIndexOutOfBoundsException exception){  
             if ( exception instanceof ArithmeticException) {
                    System.out.println("ArithmeticException : "+exception.getMessage());
             }
             if ( exception instanceof ArrayIndexOutOfBoundsException) {
                  System.out.println("ArrayIndexOutOfBoundsException : "+exception.getMessage());
             }
        }    
     }    
}
