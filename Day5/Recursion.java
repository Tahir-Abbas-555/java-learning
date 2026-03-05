public class Recursion {
    public static int factorial(int n) {
        if (n == 0) {
            return 1; // Base case: factorial of 0 is 1
        } else {
            System.out.print( n+"*");
            return n * factorial(n - 1); // Recursive case
        }
    }
    static int factorial2(int n) {
    if (n > 1) {
      return n * factorial(n - 1);
    } else {
      return 1;
    }
  }
    public static int sum(int start, int end) {
    if (end > start) {
      return end + sum(start, end - 1);
    } else {
      return end;
    }
  }
    public static void main(String[] args) {
        int result = factorial(5);
        System.out.println("Factorial of 5 is: " + result);
        int sumResult = sum(5, 10);
        System.out.println("Sum from 5 to 10 is: " + sumResult);
        int result2 = factorial2(5);
        System.out.println("Factorial of 5 using factorial2 is: " + result2);
    }
}
