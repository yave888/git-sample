package quest;

import java.util.Random;

public class Cleric {
    int hp = 50;
    final int maxhp = 50;
    int mp = 10;
    final int maxmp = 10;
    String name;

    //回復行動
    public void selfAid(){
        System.out.println("セルフエイドを唱えた！");
        this.mp -= 5;//MPを消費
        this.hp = maxhp;//回復
        System.out.println("HPを全回復！MPを5消費した！");
    }

    //祈る
    public void pray(int sec){
        System.out.println(this.name + "は天を仰ぎ" + sec + "秒間祈った");
        
        //理論上の回復量を乱数を用いて決定する
        int Recover = new Random().nextInt(3) + sec;

        //実際に回復
        int RecoverActual = Math.min(this.maxmp - this.mp, Recover);

        this.mp += RecoverActual;
        System.out.print(this.name + "のMPが" + RecoverActual + "回復した！");
       
    }
}
