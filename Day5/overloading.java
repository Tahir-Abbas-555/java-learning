package Day5;
public class overloading {
    public static int add(int a, int b){
        return a+b;
    }
    public static double add(double a, double b){
        return a+b;
    }
    public static String add(String a, String b){
        return a+b;
    }
    public static void main(String[] args) {
        int sumInt = add(5, 10);
        double sumDouble = add(5.5, 10.5);
        String sumString = add("Hello, ", "World!");
        System.out.println("The sum of integers is: " + sumInt);
        System.out.println("The sum of doubles is: " + sumDouble);
        System.out.println("The concatenated string is: " + sumString);
    }
}
