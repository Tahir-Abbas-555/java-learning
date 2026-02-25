public class arrayJava {

    public static void main(String[] args) {
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda", "Mercedes", "Opel"};
        int[] myNum = {10, 20, 30, 40};
        float[] myFloat = {1.5f, 2.5f, 3.5f, 4.5f};
        
        System.out.println(cars[0]);
        cars[0] = "Ferrari";
        System.out.println(cars[0]);
        System.out.println(myNum[0]);
        System.out.println(myFloat[0]);

        System.out.println(cars.length);


        String[] myCars = new String[9];
        myCars[0] = "Volvo";
        myCars[1] = "BMW";
        myCars[2] = "Ford";
        myCars[3] = "Mazda";
        myCars[4] = "Mercedes";
        myCars[5] = "Opel";
        myCars[6] = "Ferrari";
        myCars[7] = "Lamborghini";
        myCars[8] = "Porsche";


        for (int i = 0; i < myCars.length; i++) {
            System.out.println("myCars[" + i + "] = " + myCars[i]);
        }

        int i = 0;
        for (String car : myCars) {
            System.out.println("myCars[" + (i++) + "] = " + car);
        }

        int ages[] = {20, 22, 18, 35, 48, 26, 87, 70};
        
        float avg, sum = 0;
        int length = ages.length;

        for (int age : ages){
            sum += age;
        }
        

        avg = sum / length;

        System.out.println("The average age is: " + avg);

        int hi = ages[0];
        int low = ages[0];
        for (int age : ages) {
            if (hi<age){
                hi = age;
            }
            if (low>age){
                low = age;
            }
        }
        System.out.println("The highest age is: " + hi);
        System.out.println("The lowest age is: " + low);

       for (int age : ages) {
           if (age < 30) {
               continue;
           }
           System.out.println("Age: " + age);
       }

    }
}