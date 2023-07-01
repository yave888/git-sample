package quest2;
import quest2.Hero;
import quest2.Matango;
import quest2.SuperHero;

public class Main {
    public static void main(String[] args){
        Hero h = new Hero();
        System.out.println(h.name + "を生成");
        SuperHero s = new SuperHero();
        System.out.println(s.name + "を生成");
    }
}
