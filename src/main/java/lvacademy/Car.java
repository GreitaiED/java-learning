package lvacademy;

public class Car {

    private String modeName;
    private int fuel;
    private int mileage;
    private int wear;

    public Car(String modeName) {
        this.modeName = modeName;
        this.fuel = 50;
        this.mileage = 0;
        this.wear = 0;
    }

    @Override
    public String toString() {
        return "Car{" +
                "modeName='" + modeName + '\'' +
                ", fuel=" + fuel +
                ", mileage=" + mileage +
                ", wear=" + wear +
                '}';
    }

    void drive() {
        // if fuel >==10 && wear < 90

        // fuel = fuel - 10
        // mileahe + 50
        // wear + 10
        // if fuel < 10 will print not enought fuel
        //rlse ->

        if (fuel >= 10 && wear < 90) {
            fuel = fuel - 10;
            mileage = mileage + 50;
            wear = wear + 10;
        } else if (fuel < 10) {
            System.out.println("Not enough fuel");
        } else {
            System.out.println("Car is very used!");
        }
    }
        public void refuel() {
            if (fuel < 100) {
                fuel = fuel + 30;
                if (fuel > 100) fuel = 100;
                System.out.println(modeName + " is refueled");
            } else {
                System.out.println("Tank is full");
            }
        }
            // service decrease wear on 30;
            // if wear > 0; wear = wear - 30;
            // if wear < 0 ; wear = 0;
            // print -> model + " got service"
            // else -> print -> "in a good condition"

        public void rewear() {

             if(wear > 0){
                 wear = wear - 30;
                 if (wear < 0) wear = 0;
                 System.out.println(modeName + " got serves");
             }else{
                 System.out.println("in a good condition");
             }
            }

            void showStatus() {
                 System.out.println("Mode: " + modeName + " Wear: " + wear + " fuel: " + fuel + " mileage: " + mileage);
            }
    }
