package caps;
import javax.swing.JOptionPane;

public class Main {
 public static void main(String[] args){
    
    Hero h = new Hero("ランス");
    // System.out.println(h.getHp());
    Wizard m = new Wizard("志津香", 100);
    m.heal(h);
    Hero h2 = new Hero("リック");

    Cleric c = new Cleric("カヲル");

    Hero.setRandomMoney();
    Hero.money += 100;
    System.out.println(Hero.money);
    h.money += 300;
    System.out.println(h.money);
    h2.money += 30;
    System.out.println(h2.money);

    }
}
