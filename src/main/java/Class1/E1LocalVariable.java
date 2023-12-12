package Class1;

public class E1LocalVariable {
    public class Cat {
        //instance variable
        String name="kitti";

        void printName(){
            //local Vairable
            String name="Pishak";
            System.out.println(name);
        }

        public void main(String[] args) {
            Cat c=new Cat();
            c.printName();
        }
    }
}
