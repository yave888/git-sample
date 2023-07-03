package caps;

public class Wizard extends Character {
    
    private Wand wand;

    public Wizard(String name, int mp) {
        super();
        setName(name);
        setHp(100); // HPの初期値を設定
        setmp(100);
        wand = new Wand(); // Wandのインスタンスを生成して代入
        wand.setPower(30); // wandのパワーを設定
        System.out.println(getName() + "が生まれた！");
        System.out.println(toString());
        System.out.println("");
    }

    public void heal(Hero h) {
        System.out.println(getName() + "の回復魔法！");
        int basePoint = 10; // 基礎回復量
        double wandPower = wand.getPower();
        double recoverMultiplier = Math.max(0.5, Math.min(100, wandPower));
        int recoverPoint = (int) (basePoint * recoverMultiplier); // wandのパワーによる回復量
        h.setHp(h.getHp() + recoverPoint);
        System.out.println(h.getName() + "のHPを" + recoverPoint + "回復した");
    }

    @Override
    public void attack() {
        // Wizardの攻撃処理を実装
        System.out.println(getName() + "の攻撃！");
    }

}
