// Link Soal : https://drive.google.com/file/d/1EuCY1EA_SYJTpXSdaLEkhipt_QZdwOIW/view
// Link Materi Abstract - Interface : https://drive.google.com/file/d/1tV6j8bVRfuak3-ygMchH31mTVw7N2kQW/view?usp=sharing
// Author : Hafidz Mulia 
/*
Keterangan cara baca soal
+ : public
- : private
# : protected
style italic / miring : abstract

Method abstract : method yang tidak memiliki body dan harus di implementasikan oleh subclassnya
class abstract : class yang memiliki minimal 1 method abstract
interface : class abstract yang memiliki method auto abstract semua, tidak memiliki body { }
*/
abstract class Animal{
    protected int legs;
    // Konstruktor int legs untuk menginisiasi legs
    protected Animal(int legs){
        this.legs = legs;
    }
    // Method walk() -> mencetak kata "Berjalan"
    public void walk(){
        System.out.println("Berjalan");
    }
    // Method abstract eat() dan abstract info() -> method abstract tidak memiliki body { }
    public abstract void eat();
    public abstract void info();
    // 2 Method ini harus di override / implementasikan oleh subclass Fish dan Cat
}

interface Pet {
    // Semua method di interface sudah pasti abstract dan tidak memiliki body { }
    public String getName();
    public void setName(String name);
} 

class Cat extends Animal implements Pet{
    private String name;
    // Konstruktor cat akan mengisi data member name dan legs = 4
    public Cat(String name){
        // super(4) -> memanggil konstruktor Animal(4), yaitu mengisi data member legs = 4
        super(4);
        this.name = name;
    }
    // Method eat() -> mencetak kata "Daging"
    public void eat(){
        System.out.println("Daging");
    }
    // Method info() -> mencetak legs; walk() dan eat()
    public void info(){
        System.out.println("Kucing memiliki "+legs+" kaki");
        walk();
        eat();
    }
    // Method getName() dan setName() dari interface Pet harus di override
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
}

class Fish extends Animal implements Pet{
    private String name;
    // Konstruktor fish akan mengisi data member name dan legs = 0
    public Fish(String name){
        // super(0) -> memanggil konstruktor Animal(0), yaitu mengisi data member legs = 0
        super(0);
        this.name = name;
    }
    // Method eat() -> mencetak kata "Pelet"
    public void eat(){
        System.out.println("Ganggang");
    }
    // Method info() -> mencetak legs; swim() dan eat()
    public void info(){
        System.out.println("Ikan tidak memiliki kaki");
        walk();
        eat();
    }
    public void walk(){
        System.out.println("Berenang");
    }
    // Method getName() dan setName() dari interface Pet harus di override
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
}

// class tes berfungsi untuk ngecek algoritma saja, ketika mengerjakan soal tidak wajib di tulis
public class tes {
    public static void main(String[] args) {
        Fish f = new Fish("Nemo");
        Cat c = new Cat("Tom");
        f.info();
        c.info();
    }
}