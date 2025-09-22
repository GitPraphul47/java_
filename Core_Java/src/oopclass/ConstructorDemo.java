package oopclass;
class Animal {
    public void Animal(){
        System.out.println("Default Constructor");
    }
    public void Animal(String a){ // this is called constructor overloading
        System.out.println("animal is "+a+" and it barks ");
    }
}
class Monkey{
    Animal species ;
    public void sounds (String animal){
        species.Animal(animal);
    }
    Monkey(Animal Species){
        this.species = Species ;
    }
}
public class ConstructorDemo {
    public static void main(String[] args) {
        Animal n = new Animal();
        Monkey m = new Monkey(n);
        n.Animal();
        m.sounds("Dog");
    }
}
