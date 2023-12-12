package Class1;

public class CarTester {
    public static void main(String[] args) {
        Car MyCar=new Car();
        MyCar.Name="Benz";
        MyCar.model="G Wagon";
        MyCar.Color="Black";
        MyCar.Price=200000;
        System.out.println(MyCar.Name);
        System.out.println(MyCar.model);
        System.out.println(MyCar.Color);
        System.out.println(MyCar.Price);
        MyCar.honk();
        MyCar.drive();
        MyCar.ApplyBrake();
    }
}
