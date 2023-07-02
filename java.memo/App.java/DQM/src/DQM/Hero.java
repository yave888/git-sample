package DQM;

public class Hero extends Character {
    
    public Hero(String name, int hp) {
        super(name, hp);
    }

    public void attack(Monster m){
        System.out.println(this.name + "の攻撃！");
        System.out.println( m.name + "に10ポイントのダメージ！");
        m.hp -= 10;
    }
}
