package time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.ZoneId;

public class Main {
    public static void main(String[] args) {
        // LocalDateTimeの生成方法
        LocalDateTime l1 = LocalDateTime.now(); // 現在日時を取得

        // DateTimeFormatterを使用してフォーマットを指定
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDateTime = l1.format(formatter);

        // 日付文字列の解析
        LocalDate ldate = LocalDate.parse("2020/09/22", DateTimeFormatter.ofPattern("yyyy/MM/dd"));

        System.out.println(formattedDateTime); // フォーマットされた現在日時を出力
        System.out.println(ldate); // 解析された日付を出力

        // 1000日後を計算する
        LocalDate ldatep = ldate.plusDays(1000);
        String str = ldatep.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        System.out.println("1000日後は" + str);

        LocalDateTime l2 = LocalDateTime.of(2020, 1, 1, 9, 5, 0, 0); // 時間を指定して取得

        // LocalDateTimeとZonedDateTimeの相互変換
        ZonedDateTime z1 = l2.atZone(ZoneId.of("Europe/London"));
        LocalDateTime l3 = z1.toLocalDateTime();
        System.out.println(z1); // ZonedDateTimeを出力
        System.out.println(l3); // LocalDateTimeを出力
        System.out.println(l1); // 現在日時を出力
    }
}
