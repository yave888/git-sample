public class Main{
    public static void main(String[]args){
        System.out.println("明日の天気は？ 晴れ or 雨");
        String tenki = new java.util.Scanner(System.in).nextLine();
        if (tenki.equals("晴れ")){
            System.out.println("野球をします");
        }else{
         System.out.println("家で勉強します");
        }
    }
}