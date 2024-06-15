// Link Soal : https://drive.google.com/file/d/1k1BKLgcyWhvLjokyjOySbjRcy7jwmCJO/view?usp=sharing
// Author : Hafidz Mulia 
/*
Keterangan cara baca soal
+ : public
- : private
# : protected
style italic / miring : abstract
*/
class Titik2D{
    private int x;
    private int y;
    public Titik2D(){
        x = 0;
        y = 0;
    }
    public Titik2D(int x, int y){
        this.x = x;
        this.y = y;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public void setX(int x){
        this.x = x;
    }
    public void setY(int y){
        this.y = y;
    }
    // Method info() -> mencetak antribut (x,y)
    public void info(){
        System.out.println("("+x+","+y+")");
    }
    // Method jarak0() -> mengembalikan nilai jarak antara titik (x,y) ke titik (0,0)
    public double jarak0(){
        return Math.sqrt(x*x+y*y);
    }
}
class Titik3D extends Titik2D{
    private int z;
    public Titik3D(){
        super();
        z = 0;
    }
    public Titik3D(int x, int y, int z){
        super(x,y);
        this.z = z;
    }
    public int getZ(){
        return z;
    }
    public void setZ(int z){
        this.z = z;
    }
    // Method info() -> mencetak atribut (x,y,z)
    public void info(){
        System.out.println("("+getX()+","+getY()+","+z+")");
    }
    // Method jarak0() -> mengembalikan nilai jarak antara titik (x,y,z) ke titik (0,0,0)
    public double jarak0(){
        return Math.sqrt(getX()*getX()+getY()*getY()+z*z);
    }
}

// class tes berfungsi untuk ngecek algoritma saja, ketika mengerjakan soal tidak wajib di tulis
public class tes {
   public static void main(String[] args) {
    Titik2D t2 = new Titik2D(3,4);
    t2.info();
    System.out.println(t2.jarak0());
    
    System.out.println("==============");
    Titik3D t3 = new Titik3D(3,4,5);
    t3.info();
    System.out.println(t3.jarak0());
   } 
}
