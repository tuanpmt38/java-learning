abstract class Bike{
    abstract void run();
}
class Honda extends Bike{
    @Override
    void run(){
        System.out.println("Hon da chay voi van toc toi da 90km/h");
    }
}
class TestAbstract{
    public static void main(String[] args) {
        Honda honda = new Honda();
        honda.run();

        System.out.println("===========");

        Shape shape = new Rectangle();
        shape.draw();

        Cricle cricle = new Cricle();
        cricle.draw();

    }
}

abstract class Shape{
    abstract void draw();
}

class Cricle extends Shape{
    @Override
    void draw()
    {
        System.out.println("ve hinh tron");
    }
} 
class Rectangle extends Shape{
    @Override
    void draw(){
        System.out.println("ve hinh chu nhat");
    }
}