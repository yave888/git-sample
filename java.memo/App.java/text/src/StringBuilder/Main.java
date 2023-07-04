package StringBuilder;

public class Main {
    public static void main(String[] args) {
        // StringBuilder sb = new StringBuilder();
        // for (int i = 0; i < 10; i++) {
        //     sb.append("Java");
        // }
        // String s = sb.toString();
        // System.out.println(s);

        // String s2 = "Java";
        // boolean isMatch = s2.matches("J.va");
        // System.out.println(isMatch);


        //文字列の分割（split）
        String d = "abc,def:ghi";
        String[] words = d.split("[,:]");
        for(String w : words){
            System.out.print(w + "からの");
        }

        //文字列の置換（replace）
        String r = "abc,def,ghi";
        String w2 = r.replaceAll("[beh]", "あなや");
        System.out.println(w2);
    }

    
}
