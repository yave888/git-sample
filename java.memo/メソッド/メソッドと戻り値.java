public class Main{
    public static int add(int x,int y){
        int ans = x + y;
        return ans;
    }
    public static void main(String[] args){
        //右から評価するので挙動的にはaddメソッドを呼び出して戻り値を変数に代入している
        int ans = add(100,10);
        System.out.println("100 + 10 = " + ans);
    }
}