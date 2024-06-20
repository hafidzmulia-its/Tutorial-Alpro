// Link Soal : intip.in/soalalya
// Author : Hafidz Mulia
public class Drone implements Radio, WiFi{
    public int maxSpeed;
    public int maxAltitude;
    public void sendSignal(){
        System.out.println("Signal has been sent");
    }
    public void sendData(){
        System.out.println("Data has been sent");
    }
}
