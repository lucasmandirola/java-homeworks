package POO;

public class SmartDevice {

    boolean bluetooth;
    boolean nfc;
    boolean wifi;
    boolean turn = false;
    double screen;
    int battery;


    public SmartDevice() {}

    public SmartDevice(boolean bluetooth, boolean nfc, boolean wifi, double screen, int battery){
        this.bluetooth = bluetooth;
        this.nfc = nfc;
        this.wifi = wifi;
        this.screen = screen;
        this.battery = battery;
    }

    public void power(){
        if(this.turn){
            this.turn = false;
            System.out.println("Dispositivo apagado");
        }
        else{
            this.turn = true;
            System.out.println("Dispositivo encendido");
        }
    }
}
