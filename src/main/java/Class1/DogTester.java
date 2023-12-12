package Class1;

public class DogTester {
    public static void main(String[] args) {

        Dog dog1=new Dog();
        dog1.name="Simba";
        dog1.breed="German";
        dog1.weight=16;
        dog1.color="Black";
        dog1.age=3;
        System.out.println(dog1.name);
        System.out.println(dog1.breed);
        System.out.println(dog1.weight);
        System.out.println(dog1.color);
        System.out.println(dog1.age);

        dog1.bark();
        dog1.sleep();

        Dog dog2=new Dog();
        dog2.name="Jenny";
        dog2.breed="Russian";
        dog2.weight=5;
        dog2.color="White";
        System.out.println(dog2.name);
        System.out.println(dog2.breed);
        System.out.println(dog2.weight);
        System.out.println(dog2.color);
        dog2.eat();
        dog2.sleep();

    }
}
