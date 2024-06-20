// Link Soal : intip.in/soalalya
// Author : Hafidz Mulia
public class Desktop extends Computer implements WiFi {
    public int battCapacity;
    public void sendData(){
        System.out.println("Data has been sent punya desktop");
    }
    public void getInfo(){
        System.out.println("IP Address: "+ipAddres);
        System.out.println("CPU Clock: "+cpuClock);
        System.out.println("Memory: "+memory);
        System.out.println("Storage: "+storage);
        System.out.println("Battery Capacity: "+battCapacity);
    }
}
