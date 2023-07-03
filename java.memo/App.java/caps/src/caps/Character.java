package caps;

public abstract class Character {
    private String name;
    private int hp;
    private int mp;

    // nameをゲッター
    public String getName(){
        return name;
    }

    // セッターで条件を付けつつ名前決定
    public void setName(String name){
        if(name == null){
            throw new IllegalArgumentException("名前がnullです。処理を中断");
        }
        if(name.length() <= 1){
            throw new IllegalArgumentException("名前が短すぎます。処理を中断");
        }
        if(name.length() >= 8){
            throw new IllegalArgumentException("名前が長すぎます。処理を中断");
        }
        
        this.name = name;
    }


    public int getHp(){
        return hp;
    }

    public void setHp(int hp){
        if(hp < 0){
            this.hp = 2;
        }else
        this.hp = hp;
    }

    public int getmp(){
        return mp;
    }

    public void setmp(int mp){
        this.mp = mp;
    }

    public void run(){
        System.out.println(getName() + "は逃げ出した！");
    }


    public abstract void attack();
}
