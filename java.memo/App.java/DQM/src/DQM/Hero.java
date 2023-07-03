package DQM;

public class Hero extends Character {
    
    public Hero(String name, int hp) {
        super(name, hp);
        validateName(name);
    }

    public void attack(Monster m){
        System.out.println(this.name + "の攻撃！");
        System.out.println("に10ポイントのダメージ！");
        m.hp -= 10;
    }

    public void setName(String name) {
        validateName(name);
        this.name = name;
    }

    private void validateName(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("名前が空です。処理を中断します。");
        }
        if (name.length() > 8) {
            throw new IllegalArgumentException("名前が長すぎます。処理を中断します。");
        }
    }
}
