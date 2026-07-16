package strings;

public class builtInMethod {
    public static void main(String[] args) {
        String s = "Harsh Pratap Singh";
        // s.indexOf() --> will tell loc of P letter starting from 0(initial index) and will tell first appreance of char
        System.out.println(s.indexOf('P'));
        // s.lastIndexOf() --> will tell last index of asked char where it appeared.
        System.out.println(s.lastIndexOf('h'));
        System.out.println(s.lastIndexOf('q'));
        // s.toLowerCase()

        // s.toUpperCase()
    }
}
