package DQM;

public abstract class Character {
    String name;
    int hp;
    
    public Character(String name, int hp) {
        this.name = name;
        this.hp = hp;
        System.out.println(this.name + "が仲間になった！");
    }
    
    public void run() {
        System.out.println(this.name + "は逃げ出した！");
    }

    public abstract void attack(Monster m);
}
