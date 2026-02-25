public class ifElseStatements {

    public static void main(String[] args) {
        boolean isRaining = true;
        if (isRaining) {
            System.out.println("It's raining. Don't forget to take an umbrella!");
        } else {
            System.out.println("It's not raining. Enjoy your day!");
        }

        int x = 20;
        int y = 18;
        if (x > y) {
            System.out.println(x + " is greater than " + y);
        } else {
            System.out.println(x + " is not greater than " + y);
        }
        
        if (x > y)
            System.out.println("x is greater than y");
            // System.out.println("This line runs no matter what (not part of the if statement)");

        int weather = 2; // 1 = raining, 2 = sunny, 3 = cloudy

        if (weather == 1) {
            System.out.println("Bring an umbrella.");
        } if (weather == 2) {
            System.out.println("Wear sunglasses.");
        } else {
            System.out.println("Just go outside normally.");
        }

        // String result = (time < 18) ? "Good day." : "Good evening.";
        // System.out.println(result);

        int time = 22;
        String message = (time < 12) ? "Good morning." : (time < 18) ? "Good afternoon." : "Good evening.";
        System.out.println(message);
        
        int xa = 15;
        int ya = 25;

        if (xa < 10) {
            System.out.println("xa is less than 10");
        
            // Nested if 
            if (ya > 20) {
                System.out.println("ya is also greater than 20");
            }
        }
        int age = 20;
        boolean isCitizen = true;

        if (age >= 18) {
            System.out.println("Old enough to vote.");
        
            if (isCitizen) {
                System.out.println("And you are a citizen, so you can vote!");
            } else {
                System.out.println("But you must be a citizen to vote.");
            }
        } else {
            System.out.println("Not old enough to vote.");
        }

        if (age >= 18 && isCitizen) {
            System.out.println("You are eligible to vote.");
        } else {
            System.out.println("You are not eligible to vote.");
        }
    }
}