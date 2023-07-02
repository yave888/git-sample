package quest2;

public class SuperHero extends Hero{
    String name = "スーパーミナト";
    boolean flying;//flyingフィールドを追加

    //飛ぶ
    public void fly(){
        this.flying = true;
        System.out.println(this.name +"は飛び上がった");
    }
    //着地する
    public void land(){
        this.flying = false;
        System.out.println(this.name + "は着地した");
    }
    public void run() {
        System.out.println(this.name + "は逃げ出した！");
    }
    //飛んでいる時は二回攻撃
    //この時のsuperは「今より一つ内側のインスタンス部分を表す予約語」
    public void attack(Matango m){
        super.attack(m);//オーバーロード
        if(this.flying){
            super.attack(m);
        }
    }
    public SuperHero(){
        super();
        System.out.println("SUPER HEROのコンストラクタ起動");
    }
}
