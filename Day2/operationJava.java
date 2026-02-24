public class operationJava {
    public static void main(String[] args){ 
        // Arithmetic Operators
        int a = 10;
        int b = 3;
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));
        System.out.println("a++ = "+ (++a));
        System.out.println("a-- = "+ (--a));

        // Assignment Operators
        int c = 30;
        int d = 4;
        c -= 5;
        System.out.println("c -= 5 = " + (c));
        c += 5;
        System.out.println("c += 5 = " + (c));
        c *= 5;
        System.out.println("c *= 5 = " + (c));
        c /= 5;
        System.out.println("c /= 5 = " + (c));
        c %= d;
        System.out.println("c %= d = " + (c));
        System.out.println("5 &= 2 = " + (5 & 2));
        System.out.println("5 |= 2 = " + (5 | 2));
        System.out.println("5 ^= 3 = " + (5 ^ 3));

        // Comparison Operators
        
        int e = 10;
        int f = 10;
        System.out.println("e == f = " + (e == f)); 
        System.out.println("e != f = " + (e != f)); 
        System.out.println("e > f = " + (e > f)); 
        System.out.println("e < f = " + (e < f)); 
        System.out.println("e >= f = " + (e >= f)); 
        System.out.println("e <= f = " + (e <= f)); 
        
        // Logical Operators
        boolean g = true;
        boolean h = false;
        System.out.println("g && h = " + (g && h)); 
        System.out.println("g || h = " + (g || h)); 
        System.out.println("!g = " + (!g));


        int result1 = 10 - 2 + 5;  
        int result2 = 10 - (2 + 5); 

        System.out.println(result1);
        System.out.println(result2);

    }
}