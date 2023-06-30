public class Main{
    public static void main(String[] args){
        int[] seq = new int[10];
        
        //塩基配列をランダムに生成
        for (int i = 0; i < seq.length; i++){
        seq[i] = new java.util.Random().nextInt(4);
    }
    
    
        //生成した塩基配列の記号を表示
        for(int i = 0; i< seq.length; i++){
            switch(seq[i]){
                case 0:
                    System.out.println("A");
                    break;
                case 1:
                    System.out.println("B");
                    break;
                case 2:
                    System.out.println("C");
                    break;
                case 3:
                    System.out.println("D");
                    break;
            }
        }
    }
}