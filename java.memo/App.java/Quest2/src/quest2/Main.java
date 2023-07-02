package quest2;
import quest2.Hero;
import quest2.Matango;
import quest2.SuperHero;
import quest2.Item;
import quest2.Weapon;
import quest2.PoisonMatango;
import quest2.Character;
import quest2.Dancer;

public class Main {
    public static void main(String[] args){

        // SuperHero sh = new SuperHero();
        // Weapon w = new Weapon();

        Hero h = new Hero();
        System.out.println(h.name + "を生成");
        SuperHero sh = new SuperHero();
        System.out.println(sh.name + "を生成");
        sh.run();
        Matango m = new Matango('A');
        System.out.println("お化けキノコが現れた！");
        sh.fly();
        sh.attack(m);
        sh.land();
        PoisonMatango p = new PoisonMatango('B');
        p.attack(h);
        p.attack(h);
        p.attack(h);
        Dancer d = new Dancer("ママ",10);
        System.out.println(d.name + "を生成");
        d.attack(m);


        
    }
}
