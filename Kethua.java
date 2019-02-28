public class Kethua{
    public static void main(String[] args) {
        
        Dog dog = new Dog();
        dog.eat();
        dog.speak();

        System.out.println("-----------");

        BabyDog babyDog = new BabyDog();
        babyDog.eat();
        babyDog.hair();
        babyDog.speak();        
        
    }
    
}
class Animals {
    void eat(){
        System.out.println("eating");
    }
}

class Dog extends Animals{
    void speak(){
        System.out.println("gau gau ...!");
    }
}

class BabyDog extends Dog{
    void hair(){
        System.out.println("yellow");
    }
}