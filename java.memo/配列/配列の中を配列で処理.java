public class Main {
    public static void main(String[] args) {
        int[] seq = new int[10];
        
        // 塩基配列をランダムに生成
        for (int i = 0; i < seq.length; i++) {
            seq[i] = new java.util.Random().nextInt(4);
        }
    
        // 生成した塩基配列の記号を表示
        char[] base = {'A', 'B', 'C', 'D'};
        for (int i = 0; i < seq.length; i++) {
            System.out.print(base[seq[i]] + " ");
        }
    }
}
