package strings;

public class passingStringtoMethod {
    public static void change(String x){
        x = "Veer";
    }
    public static void main(String[] args) {
        String x = "Harsh";
        System.out.println(x);
//        change(x); // no change means non-mutable
        x = "Veeru";// will change 
        System.out.println(x);
    }
}
