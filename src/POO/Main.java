package POO;

public class Main {
    public static void main(String[] args) {

        SmartPhone iPhone11 = new SmartPhone(true,true, true, 11.6, 1400, true );
        SmartWatch appleWatch = new SmartWatch(true,true, false, 3.5, 700, "goma");
        System.out.println("iPhone11 " + iPhone11);
        System.out.println("appleWatch " + appleWatch);
        iPhone11.power();

        iPhone11.power();

        appleWatch.power();

        appleWatch.power();

    }
}
