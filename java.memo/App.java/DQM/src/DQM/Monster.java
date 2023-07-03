package DQM;

public abstract class Monster {
    protected int hp;
    protected String name;

    public Monster(String name, int hp) {
        this.name = name;
        this.hp = hp;
        System.out.println(this.name + "が現れた！");
    }

    public abstract void run();

    public int getHp() {
        return hp;
    }
}