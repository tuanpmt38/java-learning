interface Printable{
    void print();
}
interface Showable{
    void show();
}

 class Cricle1 implements Printable, Showable{
    public void print(){
        System.out.println("in ra man hinh, hinh tron");
    }
    public void show(){
        System.out.println("show hinh tron ");
    }
    
}

class DemoInterface2{
    public static void main(String[] args) {
        Cricle1 cricle = new Cricle1();
        cricle.print();
        cricle.show();
    }
}

