public class Main {
    public static void main(String[] args) {
        Boss angryBoss = new Boss();
        angryBoss.setBossHealth(1000);
        angryBoss.setBossDamage(80);
        angryBoss.setBossDefense("Magical");
        System.out.println("Boss health: " + angryBoss.getBossHealth());
        System.out.println("Boss damage: " + angryBoss.getBossDamage());
        System.out.println("Boss defense: " + angryBoss.getBossDefense());


        // ДЗ на сообр-ть.
        Hero[] heroes = createHero();
        for (Hero hero : heroes) {
            System.out.println("Hero health: " + hero.getHeroHealth());
            System.out.println("Hero damage: " + hero.getHeroDamage());
            System.out.println("Hero SuperSkill: " + hero.getHeroSuperSkill());

        }


    }


    public static Hero[] createHero() {
        Hero archer = new Hero(200, 20, "Arrow");
        Hero mandalorian = new Hero(220, 25, "Armor");
        Hero babyYoda = new Hero(100, 10);
        Hero[] heroes = {archer, mandalorian, babyYoda};
        return heroes;


    }

}