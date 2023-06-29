public class Main{
    public static void main(String[] args){
        System.out.println("あなたの運命を占います");
        int fortune = new java.util.Random().nextInt(5) + 1;
        switch(fortune){
            case 1:
            case 2:
                System.out.println("大吉");
                break;
            case 3:
                System.out.println("小吉");
                break;
            case 4:
            case 5:
                System.out.println("凶");
        }
    }
}