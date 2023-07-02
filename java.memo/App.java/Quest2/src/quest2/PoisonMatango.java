package quest2;

public class PoisonMatango extends Matango {
    int poison = 5;

    public PoisonMatango(char suffix){
        this.suffix = suffix;
    }

    public void attack(Hero h){

        super.attack(h);
        //通常攻撃はマタンゴのものを流用
        // System.out.println("キノコ" + this.suffix + "の攻撃");
        // System.out.println("10のダメージ");
        // h.hp -= 10;
        if(this.poison > 0){
            System.out.println("さらに毒の胞子をばらまいた！");
            int poisonDamage =  h.hp / 5;
            h.hp -= poisonDamage;
            System.out.println(poisonDamage + "のダメージ！");

            poison -= 1;
            System.out.println("残りの毒は" + poison);
        }
    }

}
