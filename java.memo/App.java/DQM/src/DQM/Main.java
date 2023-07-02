package DQM;

public class Main {
    public static void main(String[] args) {

        Monster[] monsters = new Monster[3];
        monsters[0] = new Slime("スライムA", 3);
        monsters[1] = new Slime("スライムB", 3);
        monsters[2] = new Slime("スライムC", 3);

        for (Monster monster : monsters) {
            monster.run();
        }

        Hero h = new Hero("はる", 50);
        h.attack(monsters[0]);

        Wizard w = new Wizard("みさ", 3);
        w.Fireball();

        Character[] characters = new Character[3];
        characters[0] = new Hero("aaa", 1);
        characters[1] = new Hero("iii", 2);
        characters[2] = new Wizard("uuu", 3);

        // 宿屋に泊まる
        for (Character character : characters) {
            character.hp += 50;
            System.out.println(character.name + "は回復した");
        }

        h.attack(monsters[0]);
    }
}
