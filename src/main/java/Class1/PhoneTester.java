package Class1;

public class PhoneTester {
    public static void main(String[] args) {
        Phone phone1=new Phone();
        phone1.name="Iphone";
        phone1.model="12 Pro Max";
        phone1.color="Blue";
        phone1.storage=256;
        System.out.println(phone1.name);
        System.out.println(phone1.model);
        System.out.println(phone1.color);
        System.out.println(phone1.storage);
        phone1.MakingCall();
        phone1.Watching();
        phone1.Capturing ();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");
        Phone phone2=new Phone();
        phone2.name="Samsung";
        phone2.model="S 23 Ultra";
        phone2.color="Navy Green";
        phone2.storage=128;
        System.out.println(phone2.name);
        System.out.println(phone2.model);
        System.out.println(phone2.color);
        System.out.println(phone2.storage);
        phone2.MakingCall();
        phone2.Watching();
        phone2.Capturing ();
    }
}
