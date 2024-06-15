// Link Soal : https://drive.google.com/file/d/1k1BKLgcyWhvLjokyjOySbjRcy7jwmCJO/view?usp=sharing
// Author : Hafidz Mulia

public class UTS_2017{
    public static void main(String[] args) {
        // Membuat objek E1 dengan E1.a = 17
        E1 obj1 = new E1(17);
        System.out.println(obj1.getA()+","+obj1.f(20));

        // Membuat objek E2 dengan E1.a = 12
        E2 obj2 = new E2(12);
        System.out.println(obj2.getA()+","+obj2.f(34));

    }

}
class E1{
    protected int a;
    // Konstruktor menginisiasi variabel a dengan parameter x
    public E1(int x){
        a = x;
    }
    public int getA(){
        return a;
    }
    public int f(int x){
        return x + a;
    }
}
class E2 extends E1{
   
    protected int a;
    public E2(int y){
        // super(y) -> memanggil konstruktor E1(y), yaitu menginisiasi a = y
        // contoh : E2 obj = new E2(10);
        // E1.a = 10 + 100 = 110
        // E2.a = 0;
        super(y+100);
    }
    public int getA(){
        // return a -> mengembalikan nilai a dari class E2
        return a;
    }
}
