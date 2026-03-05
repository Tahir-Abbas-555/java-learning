package Day5;
public class returnMethodJava {
    public static int add(int a, int b){
        return a+b;
    }
    public static int doubleGame(int x) {
        return x * 2;
    }
    public static void main(String[] args) {
        int sum = add(5, 10);
        System.out.println("The sum is: "+sum);
        for (int i = 1; i <= 5; i++) {
            System.out.println("Double of " + i + " is " + doubleGame(i));
        }
    }   
}
