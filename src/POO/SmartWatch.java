package POO;

public class SmartWatch extends SmartDevice {

    String band;
    public SmartWatch() {}

    public SmartWatch(boolean bluetooth, boolean nfc, boolean wifi, double screen, int battery, String band) {
        super(bluetooth, nfc, wifi, screen, battery);
        this.band = band;
    }

    @Override
    public String toString() {
        return "SmartWatch{" +
                "band='" + band + '\'' +
                ", bluetooth=" + bluetooth +
                ", nfc=" + nfc +
                ", wifi=" + wifi +
                ", turn=" + turn +
                ", screen=" + screen +
                ", battery=" + battery +
                '}';
    }
}
