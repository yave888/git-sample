package quest2;

public  abstract class Character {
    String name;
    int hp;
    public void run(){
        System.out.println(this.name + "は逃げ出した！");
    }

    public abstract void attack(Matango m);
    public abstract void attack(PoisonMatango p);
}
