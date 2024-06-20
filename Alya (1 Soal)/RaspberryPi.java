
// Link Soal : intip.in/soalalya
// Author : Hafidz Mulia
public class RaspberryPi extends Computer implements Radio, WiFi{
    public int numSocket;
    public void sendSignal(){
        System.out.println("Signal has been sent punya raspberyy");
    }
    public void sendData(){
        System.out.println("Data has been sent punya raspberry");
    }
    public void getInfo(){
        System.out.println("IP Address: "+ipAddres);
        System.out.println("CPU Clock: "+cpuClock);
        System.out.println("Memory: "+memory);
        System.out.println("Storage: "+storage);
        System.out.println("Number of Socket: "+numSocket);
    }
}
