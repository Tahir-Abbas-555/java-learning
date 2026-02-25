public class multidimensionalJava {

    public static void main(String[] args) {
        int[][] numbers = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(numbers.length);
        for (int[] number : numbers) {
            for (int num : number) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
        int[][] myNumbers = { {1, 4, 2}, {3, 6, 8, 5, 2} };
        for (int[] number : myNumbers) {
            for (int num : number) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

        for (int i = 0; i<myNumbers.length; i++) {
            for (int j = 0; j<myNumbers[i].length; j++) {
                System.out.print(myNumbers[i][j] + " ");
            }
            System.out.println();

        }
    }
}