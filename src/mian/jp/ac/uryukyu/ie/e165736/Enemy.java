package jp.ac.uryukyu.ie.e165736;

public class Enemy extends LivingThing {
    public Enemy(System name , int hp, int attack){
    super(name,hp,attack);
    }
    public void wounded(int damage){
        setHitPoint(getHitPoint() - damage);
        if (getHitPoint() < 0){
            Dead(true);
            System.out.print("モンスター%sは倒れた。\n", getName());
        }
    }
}