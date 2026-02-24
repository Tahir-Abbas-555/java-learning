public class stringsJava {
    public static void main(String[] args) {
        String name = "John Doe";
        String greeting = "Hello, " + name + "!";
        String name2 = "John Doe";
        System.out.println(greeting);

        // String methods
        System.out.println("Length of name: " + name.length());
        System.out.println("Uppercase: " + name.toUpperCase());
        System.out.println("Lowercase: " + name.toLowerCase());
        System.out.println("Starts with 'John': " + name.startsWith("John"));
        System.out.println("Ends with 'Doe': " + name.endsWith("Doe"));
        System.out.println("Character at index 2: " + name.charAt(2));
        System.out.println("Equals name2: " + name.equals(name2));
        System.out.println("Lowercase: " + name.toLowerCase());
        System.out.println("Index of 'o': " + name.indexOf('o'));
        System.out.println("Substring (0, 4): " + name.substring(0, 4));
        System.out.println("Contains 'Doe': " + name.contains("Doe"));

        // Concatenation in Sentences

        String firstName = "Jane ";
        String lastName = "Smith";
        String fullName = firstName.concat(lastName);
        System.out.println("Full Name: " + fullName); 

        String x = "10";
        int y = 20;
        String z = x + y; 
        System.out.println("Concatenation of String and int: " + z);

        System.out.println("Concatenation \\ of String and int: " + z);

    }
}