package oopclass;
class City{
    public  void City(){
        System.out.println("this is default constructor of city");
    }
    public void City1(String a ){
        System.out.println(" this is the city of parameteriozed constructor "+ a );
    }
}
class City2{
    City s;
    public void City2(String name){
//        System.out.println("this is city 2 and name is : " + name );
        s.City1(name);
    }
    City2(City city){
        this.s=city;
    }
}
public class ConstructorDemo2 {
    public static void main(String[] args) {
    City s = new City();
//    s.City();
//    s.City("Delhi");
    City2 ss = new City2(s);
    ss.City2("Dehradun");
    }
}
