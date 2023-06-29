public class Main{
    public static void main(String[] args){
        int isHungry = new java.util.Random().nextInt(2);
        String food = "カレーパン";
        System.out.println("こんにちは");
        if(isHungry == 0){
            System.out.println("お腹がいっぱいです");
        }else{
            System.out.println("腹ペコです");
            System.out.println(food + "をいただきます");
            System.out.println("ごちそうさまでした");
        }
    }
}