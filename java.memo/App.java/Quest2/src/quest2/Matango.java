package quest2;

public class Matango {
    int hp = 50;
    final int LEVEL = 10;//お化けキノコのレベルに初期値を10に設定した,finalは定数
    char suffix;

    public Matango(char suffix){
        this.suffix = suffix;
    }

    public void attack(Hero h){
        System.out.println("キノコ" + this.suffix + "の攻撃");
        System.out.println("10のダメージ");
        h.hp -= 10;
    }

    public void run(){
        System.out.println("お化けキノコ" + this.suffix + "は逃げ出した");
    }
    public Matango(){
        //   8行目でコンストラクタを定義しているため空でもよいのでコンストラクタの定義がいる
    }
}