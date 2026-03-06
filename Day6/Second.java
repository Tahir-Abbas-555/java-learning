import Day5. Main;
public class Second {
    public static void main(String[] args) {
        Main mainObj1 = new Main(); // Create an instance of Main
        Main mainObj2 = new Main(); // Create an instance of Main
        mainObj1.varNum = 300; // Set the value of varNum to 300
        mainObj1.name = "Java Programming"; // Set the value of name to "Java Programming"
        // mainObj.finalVar = 500; This will cause a compile-time error because finalVar is a final variable
        mainObj1.display(); // Call the display method to print the value of varNum
        mainObj2.display(); // Call the display method to print the value of varNum

        mainObj1.speed(120); // Call the speed method to print the speed of Java
    }   
}
