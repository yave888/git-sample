package DQM;

public abstract class Character {
    public String name;
    public int hp;

    public Character(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

    public abstract void attack(Monster m);

    public int getHp() {
        return hp;
    }

    public String getName() {
        return name;
    }

    
}