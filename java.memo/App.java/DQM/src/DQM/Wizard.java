package DQM;

public class Wizard extends Character{


    public Wizard(String name,int hp){
        super(name,hp);
    }

    public void attack(Monster m){
        System.out.println(this.name + "の攻撃！");
        System.out.println("敵に10ポイントのダメージ！");
        m.hp -= 10;
    }

    public void Fireball(){
        System.out.println(this.name + "は原初の火を呼び出した！");
    }
}
