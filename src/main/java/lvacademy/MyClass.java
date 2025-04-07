package lvacademy;

public class MyClass {
    public static void main(String[] args) {
        // sout
        System.out.println("pelemeni");
        // text
        /*
        text
         */
        byte age = 52;
        System.out.println(age);

        // Maning covention;
        // Conel Case: MyClass for yout classes (Capital Canel Case)
        // Canel case: corrent for variable (lower Canel Case)
        // short 16-bit
        short currentYear = 2025;
        short teamperatur = -1000;

        // int 32-bit
        int score = 9000;
        int pelemeska = 1000000000;
        int result = (10+10) - 52;

        // long 62-bit
        long starsInGalaxy = 100_000_000L; // 1000000000
        long HowMuchPelemeniIEaten = 3123231321L;
        long currentTimeMillis = System.currentTimeMillis();
        System.out.println(currentTimeMillis);

        // float 32-bit
        float pi = 3.14159265358979f;
        float piNumber = (float) Math.PI; // casting
        float discount = 25.1f;

        // double 62-bit
        double accountBalance = 10000.00;
        double squareRoot = Math.sqrt(2);
        System.out.println(squareRoot);
        double piDouble = Math.PI;

        System.out.println(pi);
        System.out.println(piDouble);

        // char (symbol)
        char initila = 'N';
        char digit = '7';
        char symbol = '#';

        // See unicode table https://sumbl.cc/en/unicode-table/
        char smiley = '\u263a';
        System.out.println(smiley);

        // boolean (true/false)
        boolean isJavaFun = true;
        boolean isTired = true;
        boolean passed = (40 >60); // false

        //String
        String myFullName = "Edvards"; // immutable
        String mfn = new String("Edvards");;
    }
}