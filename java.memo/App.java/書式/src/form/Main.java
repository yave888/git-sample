package form;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        final String FORMAT = "%-9s %-13s 所持金%,6d";
        // String s = String.format(FORMAT, null)

        System.out.printf("製造番号%s-%02d", "SVJ", 3);

        // 現在日時を取得
        Date now = new Date();
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        String formattedDate = dateFormat.format(now);
        System.out.println(formattedDate);

        System.out.println(now.getTime());

        Date past = new Date(1600705425827L);
        String formattedPast = dateFormat.format(past);
        System.out.println(formattedPast);

        System.out.println("処理を開始します");
        long start = System.currentTimeMillis();
        try {
            // 3秒間待機
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("処理が完了しました");
        long end = System.currentTimeMillis();
        System.out.println("処理にかかった時間は..." + (end - start) + "でした");

        Calendar c = Calendar.getInstance();
        // 6つのint値からDateインスタンスを生成
        c.set(2019, 8, 22, 1, 23, 45);
        c.set(Calendar.MONTH, 10);
        Date d = c.getTime();
        System.out.println(d);

        // Dateインスタンスからint値を生成
        Date current = new Date();
        c.setTime(current);
        int y = c.get(Calendar.YEAR);
        System.out.println("今年は" + y + "年です");
    }
}
