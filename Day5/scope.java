package Day5;
public class scope {
    public static int globalVar = 15; // This is a global variable
    public static void use() {
       int localVaruse = 10; // This is a local variable
        System.out.println("Global Variable: " + globalVar);
        System.out.println("Local Variable: " + localVaruse);
        // System.out.println("Local Variable: " + localVarmain); // This will cause an error because localVarmain is not accessible here
    }
    public static void main(String[] args) {
        int localVarmain = 20; // This is a local variable
        System.out.println("Global Variable: " + globalVar);
        System.out.println("Local Variable: " + localVarmain);
        use();
        localVarmain = 30; // Modifying the local variable
        System.out.println("Modified Local Variable: " + localVarmain);
        // System.out.println("Modified Local Variable: " + localVaruse); // This will cause an error because localVaruse is not accessible here



        for (int i = 0; i < 5; i++) {
            System.out.println(i); // i is accessible here
        }

        // i is NOT accessible here


        for (int i = 0; i < 3; i++) {
            System.out.println("Loop 1: " + i);
        }

        for (int i = 0; i < 2; i++) {
            System.out.println("Loop 2: " + i);
        }
        
    }   
    
}
