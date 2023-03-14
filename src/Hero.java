public class Hero {
    int health;
    int damage;
    String superpower;

    public  Hero(int health, int damage, String superpower){
        this.health = health;
        this.damage = damage;
        this.superpower = superpower;
    }


    public Hero(int health, int damage){
        this.health = health;
        this.damage = damage;
    }


    public String getSuperpower() {
        return superpower;
    }

    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }

}


