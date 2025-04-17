package lvacademy;

public class ThierdLesson_Part2 {
    public static void main(String[] args) {

        int summa = add(10, 20);
        System.out.println(summa);
        System.out.println(add(20, 10));

        greet("Edvard");

        int add = add(10, 20, 30);
        System.out.println(add);
    }

    public static int add(int a, int b) {
        int result = a + b;
        return result;
    }

    public static int add(int a, int b, int c) {
        int result = a + b + c;
        return result;
    }

    // max0fTwo, accepts: int a, int b; return the biggest numbers

    public static int maxOfTwo(int a, int b) {
        return Math.max(a, b);
    }

    // maxOfThee
    public static int minOfTree(int a, int b, int c) {
        return Math.max(Math.max(a, b),c);
    }

    public static int maxFromArray(int[] numbers) {
        int max = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (max > numbers[i]) {
                max = numbers[i];
            }
        }
        return max;
    }

    public static void greet(String name){
        System.out.println("Hello " + name + " !");
    }
}
