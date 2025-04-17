package lvacademy;

public class ThiedLesson {
    public static void main(String[] args) {



        //conditional operators in Java

        // if (is, has -> is Raining, isRandomNumber, hasEvenValue
        boolean isRaining = true;

        if(isRaining) {
            System.out.println("Take an umbrella");
        }

        int temperature = 30;
        if(temperature > 29) {
            System.out.println("Wow it is hot!!");
        }

        if(4 > 2 || 10 > 9){
            System.out.println("Both are equals");
        }

        //if-else ....
        boolean isWeekDay = false;

        if(isWeekDay) {
            System.out.println("It is a weekday)");
        }else{
            System.out.println("It is not a weekday(");
        }

        int number = 10;
        // %
        // + - / * (

        if(number %2 == 0){
            System.out.println("Number is even");
        }else{
            System.out.println("Number is odd");
        }

        // if age => 18 access
        // in all other cases not accepted

        int age = 17;

        if(age >= 18){
            System.out.println("Age is 18");
        }else{
            System.out.println("Age is not 17");
        }

        // if-else-if-else

        int hour = 7;

        if(hour == 5){
            System.out.println("Time go fir run!!");
        }else if(hour == 7){
            System.out.println("Time have breakfast");
        }else if(hour == 9){
            System.out.println("Time have lunch");
        }else{
            System.out.println("Free time!");
        }

        // score >= 90 - nice
        // >= 70 - good
        // >= 50 - ok
        // esle -> mot ok

        int numbers = 100;

        if(numbers>=90){
            System.out.println("Perfect");
        } else if (numbers>=70) {
            System.out.println("Good");
        } else if (numbers>=50) {
            System.out.println("OK");
        }else {
            System.out.println("NOT OK");
        }

        //age -> 0 - 6 -baby
        //age 7 - 17 -> skolar
        //18 - 52 -> starik
        //52+ - bohe kak di shivosh

        int ages = 10;

        if(ages <= 6){
            System.out.println("baby");
        }else if (ages > 7 && ages <= 17){
            System.out.println("skolar");
        }else if (ages > 17 && ages <= 52){
            System.out.println("starik");
        }else{
            System.out.println("bohe kak di shivosh");
        }

        //we know conditional $ loops
        // print even number from 1 to 10

        for(int i = 2; i <= 10; i++){
            if(i % 2 == 0){
                System.out.println("Number: " + i + " is even");
            }
        }

        //Подсчитывайте сумму только для положительных чисел

        int[] numberis = {-2,-10,5,6,-100,3,0,20};

        int sum = 0;

        for(int i = 0; i < numberis.length; i++) {
            if(numberis[i]>0){
                sum = sum + numberis[i];
            } else continue;
        } System.out.println(sum);

        // 1 till 20
        // print number that can be divided by 3 and 5;
        //print divided by 3
        //print divided by 5
        //else -> just print numbers;

        int[] risla = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};

        for(int i = 0; i <= risla.length; i++){
            if (i % 3 == 0 && i % 5 == 0) {
            System.out.println(i + " делится на 3 и 5");
        } else if (i % 3 == 0) {
            System.out.println(i + " делится на 3");
        } else if (i % 5 == 0) {
            System.out.println(i + " делится на 5");
        } else {
            System.out.println(i + " ниначто");
        }

            /*
         int[] arr = new int[20];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }

        System.out.println(Arrays.toString(arr));

        for (int num : arr) {
            if (num % 3 == 0 && num % 5 == 0) {
                System.out.println("Number: " + num + " can be divided by 3 and 5");
            } else if (num % 3 == 0) {
                System.out.println("Number: " + num + " can be divided by 3");
            } else if (num % 5 == 0) {
                System.out.println("Number: " + num + " can be divided by 5");
            } else {
                System.out.println("Numbers: " + num + "can't be divided by 3 or 5");
            }
             */
            }
        }
}
