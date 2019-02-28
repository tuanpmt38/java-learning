public class Dahinh{

    public static void main(String[] args) {
        Shape shape ;
        shape = new Crilce();
        shape.draw();
        shape = new Rectangle();
        shape.draw();

    }
}
class Shape {

    void draw(){
        System.out.println("ve hinh");
    }
}

class Crilce extends Shape{
    @Override
    void draw(){
        System.out.println("ve hinh tron");
    }
}

class Rectangle extends Shape{
    @Override
    void draw(){
        System.out.println("ve hinh chu nhat");
    }
}