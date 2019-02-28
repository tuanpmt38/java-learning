 interface Edible{
     String howtoEat();
 }

 abstract class Animal{
     abstract String makeSound();
 }

 abstract class Fruit implements Edible{}

 class Apple extends Fruit{
    @Override
    public String howtoEat(){
        String apple =" qua tao";
        return apple;
    }
 }

 class TestInterface{
     public static void main(String[] args) {
        Apple apple = new Apple();
        apple.howtoEat();
        System.out.println("===== "+ apple);
     }
 }

