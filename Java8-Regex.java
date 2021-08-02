import java.util.Scanner;
import java.util.regex.*;
public class Main {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Phone Number Validation");
        long phoneNumber;
        System.out.println("Enter the phone number:");
        phoneNumber = scan.nextLong();
        if(isValidPhone(phoneNumber)) System.out.println("Your phone number is Valid");
        else System.out.println("Invalid");
    }
    public static boolean isValidPhone(long phoneNumber) {
        String ph = String.valueOf(phoneNumber);
        Pattern pattern = Pattern.compile("[6789]{1}[0-9]{9}");
        Matcher matcher = pattern.matcher(ph);
        return matcher.matches();
    }
}
