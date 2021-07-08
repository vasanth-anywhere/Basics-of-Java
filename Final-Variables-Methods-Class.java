import java.util.Scanner;

final class Count {

    final int NO_OF_ALPHABETS = 26; //Value cannot be changed
    int[] arrayOfChar = new int[NO_OF_ALPHABETS];
    public static void main(String ars[]) {
        Count count = new Count();
        count.countChars("Encyclopedia");
        for(int i=0;i<count.NO_OF_ALPHABETS;i++) {
            System.out.print((char)('a'+i)+"="+count.arrayOfChar[i]+" ");
        }
}
    public final void countChars(String word) { //Method cannot be overided
        String str = word.toLowerCase();
        for(int i=0;i<str.length();i++) {
            arrayOfChar[str.charAt(i)-'a']++;
        }
    }

}
