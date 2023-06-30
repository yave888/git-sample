public class Main{
     public static void methodB(){
        System.out.println("methodB");
    }
    public static void methodA(){
        method(B);
    }
    public static void main(String[] args){
        System.out.println("methodA");
        methodA(); //メソッドはmainから動き始める
    }
}