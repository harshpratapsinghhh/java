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
        System.out.println("LowerCase: "+s.toLowerCase());
        // s.toUpperCase()
        System.out.println("UpperCase: "+s.toUpperCase());
        // s.compareTo()
        String a = "Harsh";
        String b = "Harshit";
        String c = "Harsh";
        System.out.println(a.compareTo(b)); // -2 because it is more in harshit
        System.out.println(b.compareTo(a)); // 2
        System.out.println(c.compareTo(a)); // return 0
        // s1.concat(s2)
        String s1 = "Thakur ";
        String s2 = "Sahab";
        System.out.println("Concat: "+s1.concat(s2));

    }
}
