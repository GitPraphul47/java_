package oopclass;
class AniMal {
    String name;

}
class Dog extends AniMal{
    String name;
    void setName(String par, String chil){
        this.name=chil;
        super.name= par;
    }
}

public class ThisDemo {
    public static void main(String[] args) {
        Dog an = new Dog();
        an.setName("tommy", "kaalu");
        System.out.println(an.name);
        System.out.println(an.name);

    }
}
