package DQM;

public abstract class Monster {
    int hp;
    String name;

    public Monster(String name, int hp) {
        this.name = name;
        this.hp = hp;
        System.out.println(this.name + "が現れた！");
    }

    public void run() {
        System.out.println("モンスターは逃げ出した！");
    }
}
