// Link Soal https://docs.google.com/document/d/1xR_7rg2AJWzKQ_W-JZI0v5ZgHVCA9rxo/edit?usp=sharing&ouid=107026307665299418190&rtpof=true&sd=true
class Circle{
    private double radius;
    public Circle(){
        radius = 1.0;
    }
    public Circle(double radius){
        this.radius = radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public double getRadius(){
        return radius;
    }
    public String toString(){
         return "Circle[radius="+radius+"]";
    }
    public double getArea(){
        return Math.PI*radius*radius;
    }

}
class Cylinder extends Circle{
    private double height;
    // private double radius;

    public Cylinder(){
        // super();
        super(); // memasukkan radius = 1
        this.height = 1.0;
    }
    // public Cylinder(double radius, double height){
    //     super(radius);
    //     this.height = height;
    // }
    public Cylinder(double height, double radius){
        super(radius);
        this.height = height;
    }
    public double getHeight(){
        return height;
    }
    public void setHeight(double height){
        this.height = height;
    }
    public double getVolume(){
        return getRadius()*getRadius()* Math.PI*height;
    }
    @Override
    public double getArea(){
        return 2*Math.PI*getRadius()*height + 2*super.getArea();
    }
    @Override
    public String toString(){
        return ("Cylinder[Circle[radius="+getRadius()+"],height="+height+"]");
    }
    
}

public class tes{
    public static void main(String[] args) {
        Circle c = new Circle(7);
        System.out.println(c.getRadius());
        c.setRadius(10);
        System.out.println(c.getRadius());
        System.out.println(c.toString());


        Cylinder c1 = new Cylinder(2,5);
        System.out.println(c1.getVolume());
        System.out.println(c1.getArea());
        System.out.println(c1.toString());
        
      
    }
}