package caps;
import javax.swing.JOptionPane;

public class Main {
 public static void main(String[] args){
    
    Hero h = new Hero("ランス");
    System.out.println(h.getHp());
    Wizard m = new Wizard("志津香", 100);
    m.heal(h);
 }   
}
