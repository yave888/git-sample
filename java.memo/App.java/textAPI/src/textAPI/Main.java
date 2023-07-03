package textAPI;

public class Main {

    public static void main(String[] args){
    String s1 = "すっきりJava";
    String s2 = "JAVA";
    String s3 = "java";


    //大文字小文字含め等しい"equals""
    if(s2.equals(s3)){
        System.out.println("s2とs3が等しい");
    }

    //大文字、小文字を考慮しない"equalsIgnoreCase"
    if(s2.equalsIgnoreCase(s3)){
        System.out.println("s2とs3はケースを区別しなければ等しい");
    }

    //全角も半角も1文字としてカウントしている
    System.out.println("s1の長さは"+ s1.length() + "です");

    if(s1.isEmpty()){
        System.out.println("s1は空文字です");
    }

    if(s1.contains("JAVA")){
        System.out.println("文字列s1は、JAVAを含んでいます");
    }

    if(s1.endsWith("Java")){
        System.out.println("文字列s1は、Javaが末尾にあります");
    }

    System.out.println("文字列s1で最初にJavaが登場する位置は" + s1.indexOf("Java"));


    //見つからない場合は-1を返す
    System.out.println("文字列s1で最後にJavaが登場する位置は" + s1.lastIndexOf("JAVA"));

    System.out.println("文字列s1の4文字以降は" + s1.substring(3));

}
}