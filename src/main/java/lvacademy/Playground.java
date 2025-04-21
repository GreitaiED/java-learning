package lvacademy;

public class Playground {
    public static void main(String[] args) {
/*
        Dog rex = new Dog();

        //

        rex.setName("Rex");
        rex.setAge(1);

        rex.bark();
        rex.feed();

        System.out.println(rex.getName());
        System.out.println(rex.getAge());
*/
        Dog barsik = new Dog("Alabai");

        barsik.setName("Barsik");
        barsik.setAge(1);
        System.out.println(barsik.getName());
        System.out.println(barsik.getAge());

        // ?? Print breed name through method
        System.out.println(barsik.getBreedName());

        Dog Sabaka = new Dog("Terminator", 1, "Putbul");
        System.out.println(Sabaka);

        Car tank = new Car("T-90M");
        System.out.println(tank);
        tank.drive();
        tank.drive();
        tank.drive();
        tank.drive();
        tank.drive();
        System.out.println(tank);
        tank.drive();
        System.out.println(tank);
        tank.refuel();
        tank.rewear();
        System.out.println(tank);
        tank.refuel();
        System.out.println(tank);
        tank.rewear();
        System.out.println(tank);

        tank.showStatus();

        tank.refuel();
        tank.refuel();
        tank.refuel();
        tank.refuel();
        tank.refuel();
        tank.refuel();

        tank.rewear();
        tank.rewear();
        tank.rewear();
        tank.rewear();
        tank.rewear();
        tank.rewear();

        tank.showStatus();




    }
}
