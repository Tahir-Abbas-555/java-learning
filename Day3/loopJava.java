public class loopJava {

    public static void main(String[] args) {
        // For Loop in Java
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }

        for (int i = 0; i <= 10; i = i + 2) {
            System.out.println(i);
        }
        
        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            sum = sum + i;
        }
        System.out.println("Sum is " + sum);

        for (int i = 5; i > 0; i--) {
            System.out.println(i);
        }

        for (int i = 10; i < 5; i++) {
            System.out.println("This will never be printed");
        }


        // Nested For Loop in Java

        // Outer loop
        for (int i = 1; i <= 2; i++) {
            System.out.println("Outer: " + i); // Executes 2 times
        
            // Inner loop
            for (int j = 1; j <= 3; j++) {
                System.out.println(" Inner: " + j); // Executes 6 times (2 * 3)
            }
        }

        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.print(i * j + " ");
            }
            System.out.println();
        }

        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String car : cars) {
            System.out.println(car);
        }

        int[] numbers = {10, 20, 30, 40};
        for (int num : numbers) {
            System.out.println(num);
        }

        int number = 2;
        // Print the multiplication table for the number 2
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }

        for (int seat = 1; seat <= 5; seat++) {
            System.out.println("Seat number: " + seat);
        }

        int n = 5;
        int fact = 1;

        for (int i = 1; i <= n; i++) {
            fact *= i;
        }

        System.out.println("Factorial of " + n + " is " + fact);
        // Output: Factorial of 5 is 120

        
        //While Loop in Java
        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i++;
        }

        int countdown = 3;

        while (countdown > 0) {
            System.out.println(countdown);
            countdown--;
        }

        System.out.println("Happy New Year!!");

        while (countdown > 0) {
            System.out.println(countdown);
            countdown--;
        }

        System.out.println("Happy New Year!!");

        int dice = 1;

        while (dice <= 6) {
            if (dice < 6) {
                System.out.println("No Yatzy.");
            } else {
                System.out.println("Yatzy!");
            }
            dice = dice + 1;
        }

        // Do-While Loop in Java
        int j = 0;
        do {
            System.out.println("J is " + j);
            j++;
        }
        while (j < 5);



    }
}