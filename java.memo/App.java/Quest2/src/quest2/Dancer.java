package quest2;

public class Dancer extends Character {

    public Dancer(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

    public void dance() {
        System.out.println("えちえちな踊りだ！");
    }

    public void attack(Matango m) {
        System.out.println(this.name + "は攻撃した！");
        System.out.println("キノコ" + m.suffix + "に3のダメージを与えた！");
        m.hp -= 10;
    }
}
