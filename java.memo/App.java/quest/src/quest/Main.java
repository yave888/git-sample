package quest;
import quest.Hero;
import quest.Matango;
import quest.Cleric;
import quest.Wizard;
import quest.Thief;

public class Main {
    public static void main(String[] args){
        //ここに勇者への指示を書いていく

        //勇者を生成し初期化
        Hero h1 = new Hero("ワタナベ");
        //h1.name = "ワタナベ";//変数hのnameに代入
        
        System.out.println("勇者" + h1.name + "を生み出しました"+ "HP:" + h1.hp);
        //剣を装備
        Sword s = new Sword();
        s.name = "ドラゴンごろし";
        s.damage = 10;
        h1.sword = s;
        System.out.println(h1.name + "は" + s.name + "を装備した！");

        //盗賊を生成
        Thief t1 = new Thief("アカサ");
        System.out.println("盗賊" + t1.name + "を生み出しました" + "HP:" + t1.hp + "MP:" + t1.mp);

        Hero h2 = new Hero("ヨワシ");
        h2.hp = 20;
        //h2.name = "ヨワシ";
        System.out.println("望まれざる者、" + h2.name + "が生まれてしまった！");

        //お化けキノコを生成し初期化
        Matango m1 = new Matango();
        m1.hp = 50;
        m1.suffix = 'A';

        //オーバーロードでコンストラクタ起動
        Hero h3 = new Hero();
        System.out.println("勇者" + h3.name + "を生み出しました" + h3.hp);
        

        //聖職者を生成
        Cleric a = new Cleric();
        a.name = "ジャンヌ";
        System.out.println("聖職者" + a.name + "を生み出しました");

        //魔法使いを生成
        Wizard m = new Wizard();
        m.name = "マジック";
        System.out.println("魔法使い" + m.name + "を生み出しました");


        //お化けキノコ２体目を生成
        Matango m2 = new Matango();
        m2.hp = 48;
        m2.suffix = 'B';

        //メソッドを呼び出していく
        h1.slip();//転べ
        a.selfAid();
        a.pray(555);

        //wizardが回復魔法
        m.heal(h1);

        h1.attack();
        m1.run();
        m2.run();
        h1.run();//逃げる
    }
}
