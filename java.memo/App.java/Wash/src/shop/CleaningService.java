package shop;

public interface CleaningService {

    //インターフェースに宣言されたメソッドは自動的にpublicかつabstractになる
    //public static finalが自動的につく
    Shirt washShirt(Shirt s);
    Towl washTowl(Towl t);
    Coat washCoat(Coat c);
}
