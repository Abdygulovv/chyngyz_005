public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < createHeroes().length; i++) {
            Hero hero = createHeroes()[i];
            System.out.println(hero);
            System.out.println("health: " + hero.getHealth() + " damage: "+ hero.getDamage() + " superpower: " + hero.getSuperpower());
        }


        Boss boss = new Boss();
        System.out.println(boss);
        boss.setHealth(700);
        boss.setDamage(60);
        boss.setProtectionType("shield ");
        System.out.println("Health: " + boss.getHealth() + " damage: " + boss.getDamage() + " protectionType: " + boss.protectionType);
    }



    public static Hero[]createHeroes() {
        Hero thor = new Hero(70, 25, "optical");

        Hero hulk = new Hero(90, 30, "jumping");

        Hero flash = new Hero(80, 20, "speed");
        Hero[] allHeroes = new Hero[] {thor, hulk, flash};
        return allHeroes;

    }
    
}