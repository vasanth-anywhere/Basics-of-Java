public class Main{

     public static void main(String []args){
        try{    
            int array[] = newint[10];    
            array[10] = 30/0;    
        }    
        catch(ArithmeticException | ArrayIndexOutOfBoundsException exception){  
            System.out.println(exception.getMessage());  
        }    
     }    
}