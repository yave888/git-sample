package quest;
import quest.Hero;
import quest.Matango;
import quest.Cleric;

public class Main {
    public static void main(String[] args){
        //ここに勇者への指示を書いていく

        //勇者を生成し初期化
        Hero h = new Hero();
        h.name = "ワタナベ";//変数hのnameに代入
        h.hp = 100;//変数hのHPに100を代入
        System.out.println("勇者" + h.name + "を生み出しました");

        //お化けキノコを生成し初期化
        Matango m1 = new Matango();
        m1.hp = 50;
        m1.suffix = 'A';

        //聖職者を生成
        Cleric a = new Cleric();
        a.name = "ジャンヌ";
        System.out.println("聖職者" + a.name + "を生み出しました");

        //お化けキノコ２体目を生成
        Matango m2 = new Matango();
        m2.hp = 48;
        m2.suffix = 'B';

        //メソッドを呼び出していく
        h.slip();//転べ
        a.selfAid();
        a.pray(555);
        m1.run();
        m2.run();
        h.run();//逃げる
    }
}
