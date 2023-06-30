public class Main{
    public static void email(String title,String address,String text){
        System.out.println("メール件名:" + title);
        System.out.println("メールアドレス:" + address);
        System.out.println("本文:" + text);
    }
    public static void main(String[] args){
        System.out.println("メソッドを呼び出します");
        email("カジュアル面談のお知らせ","voyager8931@gamil.com","7/4に予約しました。");
    }
}