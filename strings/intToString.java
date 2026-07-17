package strings;

public class intToString {
    public static void main(String[] args) {
        int a = 10000;
        System.out.println("Data Type: "+((Object)a).getClass().getSimpleName());
        String s = Integer.toString(a);
        System.out.println("Data Type: "+((Object)s).getClass().getSimpleName());
    }
}
