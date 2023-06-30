public class Main{
    public static void main(String[] args){
        System.out.println("メソッドを呼び出します");
        hello("青山");
        hello("Ramu");
        hello("小倉ゆず");
        System.out.println("メソッドの呼び出しが終わりました");
    }
    public static void hello(String name){
        System.out.println(name + "さん、こんにちは");
    }
}