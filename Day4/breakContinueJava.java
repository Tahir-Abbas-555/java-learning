public class breakContinueJava {

    public static void main(String[] args) {
        int counter = 0;
        while (true){
            counter++;
            if (counter % 2 == 0){
                continue;
            }
            System.out.println("Counter: " + counter);
            if (counter == 501){
                break;
            }
        }
        System.out.println("Exited the loop at counter: " + counter);
        for (int i = 0; i <= 501; i++){
            if (i % 2 == 0){
                continue;
            }
            System.out.println("i: " + i);
            if (i == 501){
                break;
            }
        }
    }
}