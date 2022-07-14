package POO;

public class SmartPhone extends SmartDevice {
    boolean mobileData;
    public SmartPhone() {}

    public SmartPhone(boolean bluetooth, boolean nfc, boolean wifi, double screen, int battery, boolean mobileData) {
        super(bluetooth, nfc, wifi, screen, battery);
        this.mobileData = mobileData;
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "mobileData=" + mobileData +
                ", bluetooth=" + bluetooth +
                ", nfc=" + nfc +
                ", wifi=" + wifi +
                ", turn=" + turn +
                ", screen=" + screen +
                ", battery=" + battery +
                '}';
    }
}
