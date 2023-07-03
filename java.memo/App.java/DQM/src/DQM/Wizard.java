package DQM;

public class Wizard extends Character {
    public Wizard(String name, int hp) {
        super(name, hp);
    }

    public void attack(Monster m) {
        System.out.println(this.name + "の攻撃！");
        System.out.println("敵に20ポイントのダメージ！");
        m.hp -= 20;
    }

    public void Fireball() {
        System.out.println(this.name + "は火の玉を放った！");
        System.out.println("敵に50ポイントのダメージ！");
    }
}