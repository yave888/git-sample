package quest2;

public class Matango {
    int hp;
    final int LEVEL = 10;//お化けキノコのレベルに初期値を10に設定した,finalは定数
    char suffix;
    public void run(){
        System.out.println("お化けキノコ" + this.suffix + "は逃げ出した");
    }
}