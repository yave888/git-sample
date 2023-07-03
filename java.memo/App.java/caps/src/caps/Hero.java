package caps;

public class Hero extends Character {
    public Hero(String name) {
        super();
        setName(name);
        setHp(-3);
        System.out.println(getName() + "が生まれた！");
    }

    @Override
    public void attack() {
        System.out.println(getName() + "の攻撃！");
    }
}
