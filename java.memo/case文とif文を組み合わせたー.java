public class Main {
    public static void main(String[] args) {
        int weight = 60;
        int age = 20;
        int age2 = 70;
        System.out.println("あなたの名前は？");
        String name = new java.util.Scanner(System.in).nextLine();

        switch (weight) {
            case 60:
                if (age + age2 > 60 || age % 2 != 0) {
                    switch (name) {
                        case "渡邊":
                            System.out.println("合格");
                            break;
                        default:
                            System.out.println("名前が一致しません");
                            break;
                    }
                }
                break;
            default:
                System.out.println("weightが60ではありません");
                break;
        }
    }
}
