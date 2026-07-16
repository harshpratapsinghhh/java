package strings;

import java.util.Scanner;

public class stringsBasics {
    public static void main(String[] args) {
        /*
        char arr[] = {'h','a','r','s','h'};
        for(char i:arr){ // if char ki jagh int karnge toh type cast ho jayega
            System.out.print(i+" ");
        }
        System.out.println();

        String x = "I am a good Boy.";
        System.out.println(x);


        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String s = scanner.nextLine(); // sc.next() --> will print only this first word(or only word before space) of input string.
        System.out.println(s);
        // also prints emoji's
 */
        String x = "aeiou";
        System.out.println("Size of string: "+x.length());
        System.out.println("char at 3: "+x.charAt(2));
    }
}
