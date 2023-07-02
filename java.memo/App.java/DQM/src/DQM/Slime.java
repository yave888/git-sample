package DQM;

public class Slime extends Monster{
    
    public Slime(String name, int hp) {
        super(name, hp);
    }

    public void run(){
        System.out.println("スライムはぬるぬる逃げ出した！");
    }
}
