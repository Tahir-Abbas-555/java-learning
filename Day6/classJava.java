package Day6;
public class classJava {
    int instanceVar = 10; // This is an instance variable

    public void display(int insN) {
        System.out.println("The value of instanceVar " + insN + " is: " + instanceVar);
    }

    public static void main(String[] args) {

        classJava obj1 = new classJava(); 
        classJava obj2 = new classJava(); 
        obj1.display(1); 
        obj2.display(2); 
    }
}

