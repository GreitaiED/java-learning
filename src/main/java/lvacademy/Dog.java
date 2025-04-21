package lvacademy;

public class Dog {
    private String name;
    private int age;
    private String breedName = "unknown Breed";

    public Dog(String breedName) {
        this.breedName = breedName;
    }

    public Dog(String name, int age, String breedName) {
        this.name = name;
        this.age = age;
        this.breedName = breedName;
    }

    void bark() {
        System.out.println(name + " says Woof-woof!");
    }

    void feed() {
        System.out.println(name + " eating dog food!");
    }


    //Gettor & Setter


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBreedName() {
        return breedName;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", breedName='" + breedName + '\'' +
                '}';
    }
}