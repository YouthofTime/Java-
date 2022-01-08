package 类和对象;

public class Hero {
    String name;

    float hp;

    float armor; //护甲

    int moveSpeed;

    int money;

    int attackSpeed;

    int kills;
    //超神
    void legendary(){
        if(kills>=7)
            System.out.println(name+"已经超神了");
    }

    float getHp(){
        return hp;
    }

    void recovery(float blood){
        hp+=blood;
    }

    public static void main(String[] args) {
        Hero garen=new Hero();
        garen.name="盖伦";
        garen.hp=3000;
        System.out.println(garen.name+"的初始血量是"+garen.getHp());
        garen.kills=7;
        garen.legendary();
        garen.recovery(50);
        System.out.println(garen.name+"目前的血量是"+garen.getHp());
    }
}
