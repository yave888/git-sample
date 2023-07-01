package quest;

public class Wizard {
    String name;
    int hp;
    //引数を勇者に指定し回復を唱える
    public void heal(Hero h){
        h.hp += 10;
        System.out.println(name + "は回復魔法を唱えた！");
        System.out.println(h.name + "のHPを10回復した！");
    }
}
