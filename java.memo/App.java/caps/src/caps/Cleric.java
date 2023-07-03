package caps;

public class Cleric extends Character{

    static final int maxHp = 50;
    static final int maxMp = 10;

    public Cleric(String name){
        super();
        setName(name);
        setHp(maxHp); // HPの初期値を設定
        setmp(maxMp);
        System.out.println(getName() + "が生まれた！");
        System.out.println(toString());
        System.out.println("");
    }   

    public void attack(){
        System.out.println(getName() + "の攻撃！！");
    }
}
