package DQM;

public class Slime extends Monster {
    public Slime(String name) {
        super(name, 10);
    }

    public void run() {
        System.out.println("スライムはぬるぬる逃げ出した！");
    }
}