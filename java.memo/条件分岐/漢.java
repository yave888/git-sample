public class Main {
    public static void main(String[] args) {
        System.out.println("あなたの年齢は？");
        int age = Integer.parseInt(new java.util.Scanner(System.in).nextLine());
        int limit = 18 - age;

        if (age < 18) {
            System.out.println("また" + limit + "年後に来てください");
        } else {
            System.out.println("ようこそ漢の世界へ");
        }
    }
}
