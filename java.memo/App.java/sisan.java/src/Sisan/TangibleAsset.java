package Sisan;

public abstract class TangibleAsset extends Money implements Thing {
    String color;
    double weight;

    public TangibleAsset(String name, int price, String color) {
        super(name, price);
        this.color = color;
    }

    // メソッド
    public String getColor() {
        return this.color;
    }

    public double getWeight() {
        return this.weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
