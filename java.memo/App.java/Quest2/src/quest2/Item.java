package quest2;
import quest2.Weapon;

public class Item {
    String name;
    int price;

    //引数1つめのコンストラクタ
    public Item(String name){
        this.name = name;
        this.price = 0;
    }

    //引数2つめのコンストラクタ
    public Item(String name,int price){
        this.name = name;
        this.price = price;
    }
}
