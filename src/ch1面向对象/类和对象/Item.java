package ch1面向对象.类和对象;

public class Item {
    String name;
    int price;

    public static void main(String[] args) {
        Item bloodVial=new Item();
        Item strawSandals=new Item();
        Item longSword=new Item();
        bloodVial.name="血瓶";
        bloodVial.price=50;
        strawSandals.name="草鞋";
        strawSandals.price=300;
        longSword.name="长剑";
        longSword.price=350;
    }
}

