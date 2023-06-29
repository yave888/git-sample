public class Main {
    public static void main(String[] args) {
        System.out.println("[メニュー] 1:検索 2:登録 3:削除 4:変更>");
        String input = new java.util.Scanner(System.in).nextLine();

        if (input.matches("[1-4]")) {
            int selected = Integer.parseInt(input);

            switch (selected) {
                case 1:
                    System.out.println("検索します");
                    break;
                case 2:
                    System.out.println("登録します");
                    break;
                case 3:
                    System.out.println("削除します");
                    break;
                case 4:
                    System.out.println("変更します");
                    break;
            }
        } else {
            System.out.println("日本語読めんのか");
        }
    }
}
