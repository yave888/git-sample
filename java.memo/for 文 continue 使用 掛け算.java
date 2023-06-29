public class Main {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                if (i == 3 || j == 3) {
                    continue;
                }
                System.out.print(i * j + " "); // 掛け算の結果を出力
            }
            System.out.println(); // 改行を出力
        }
    }
}
