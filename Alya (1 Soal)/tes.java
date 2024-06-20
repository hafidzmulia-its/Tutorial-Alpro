// Link Soal : intip.in/soalalya
// Author : Hafidz Mulia
public class tes {
    public static void main(String[] args) {
        Desktop desktop = new Desktop();
        desktop.sendData();
        desktop.getInfo();

        System.out.println("=====================================");
        RaspberryPi raspberryPi = new RaspberryPi();
        raspberryPi.sendData();
        raspberryPi.sendSignal();
        raspberryPi.getInfo();

        System.out.println("=====================================");
        Drone drone = new Drone();
        drone.sendData();
        drone.sendSignal();


        System.out.println("=====================================");
        Operator operator = new Operator();
        operator.wifiControl(desktop, raspberryPi);
        operator.radioControl(drone);
    }
}
