package quest;

import quest.Sword;
public class Hero {
    String name;//名前の宣言
    int hp;     //HPの宣言
    Sword sword;
    final int maxhp = 100;

public Hero(String name){
     this.hp = 100;
     this.name = name;
}


    public void sleep(){
        this.hp = 100;//自分自身のhpフィールド
        System.out.println(this.name + "は、眠って回復した!");
        //this.hp = 100は「自分自身のインスタンスのhpフィールドに100を代入」という意味
    }

    public void sit(int sec){
        this.hp += sec;
        System.out.println(this.name + "は、" + sec + "秒間座った！");
        System.out.println("HPが" + sec + "ポイント回復した！");
    }

    public void slip(){
        this.hp -= 5;
        System.out.println(this.name + "は、転んだ！痛い！");
        System.out.println("5のダメージ");
    }

    public void run(){
        System.out.println(this.name + "は、逃げ出した！");
        System.out.println("GAMEOVER");
        System.out.println("最終HPは" + this.hp + "でした");
    }
    public void attack(){
        System.out.println(this.name + "は" + sword.name + "で攻撃した！");
    }
}
