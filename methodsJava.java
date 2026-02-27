public class methodsJava {
    static void table(int number){ 

        for (int i = 1; i<=10;i++){
            System.out.println(number+" x "+i+" = "+(number*i));
        }
    }
    static void display(){ 
        System.out.println("Starting the program");
        System.out.println();
        System.out.println();
        System.out.println("First Time");
        table(10);
        System.out.println();
        System.out.println();
        System.out.println("Second Time");
        table(5);
        System.out.println();
        System.out.println();
        System.out.println("Third Time");
        table(3);
    }

    static void votingAge(int age, boolean isCitizen){
        if(age>=18 && isCitizen){
            System.out.println("You are eligible to vote");
        }
        else{
            System.out.println("You are not eligible to vote");
        }
    }
    public static void main(String[] args) {
        display();
        
        votingAge(20, true);
        votingAge(17, false);
    }
}