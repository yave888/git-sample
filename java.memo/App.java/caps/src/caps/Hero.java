package caps;

public class Hero extends Character {
    public Hero(String name) {
        super();
        setName(name);
        setHp(-3);
        System.out.println(getName() + "が生まれた！");
        System.out.println(toString());
        System.out.println("");
    }

    @Override
    public void attack() {
        System.out.println(getName() + "の攻撃！");
    }

    static int money;//静的フィールド

    public static void setRandomMoney(){
        Hero.money = (int)(Math.random() * 100);
    }

}
